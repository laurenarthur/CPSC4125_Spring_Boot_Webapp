package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
//import com.example.springboot.ContactService;
import com.example.springboot.Contact;

@Controller
public class HelloController {
    // @Autowired
    // private ContactService contactService;

    @GetMapping("/")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
    }
    
    @GetMapping("/contact")
    public String contact(Model model){
        System.out.println("boo");
        return "contact";
    }

    @PostMapping("/contact")
    public String setContact(Model model, @RequestBody Contact contact){
        System.out.println(contact.getName());
        System.out.println(contact.getMessage());
        return "contact";
    }

    @GetMapping("/about")
    public String about(Model model){
        return "about";
    }

}
