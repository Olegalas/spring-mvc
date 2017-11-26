package com.dexter.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(path = "/")
public class HelloWorldController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String hello(ModelMap map){
        System.out.println("Hello world");
        map.addAttribute("message", "Hello from Spring MVC");
        return "hello";
    }

    @RequestMapping(path = "/model", method = RequestMethod.POST)
    public String model(@ModelAttribute User user, ModelMap map){
        System.out.println(user);

        map.addAttribute("name", user.getName());
        map.addAttribute("email", user.getEmail());
        return "user";
    }

    @RequestMapping(path = "/param", method = RequestMethod.POST)
    public String param(@RequestParam(defaultValue = "WAS NOT SET") String name,
                        @RequestParam(defaultValue = "WAS NOT SET") String email,
                        ModelMap map){
        System.out.println("Name - " + name);
        System.out.println("Email - " + email);

        map.addAttribute("name", name);
        map.addAttribute("email", email);
        return "user";
    }

    @RequestMapping(path = "/user/{id}", method = RequestMethod.POST)
    public String path(@PathVariable String id,
                       @RequestParam String name,
                       @RequestParam String email,
                       ModelMap map){
        System.out.println("Id : " + id);

        System.out.println("Name - " + name);
        System.out.println("Email - " + email);

        map.addAttribute("name", name);
        map.addAttribute("email", email);
        return "user";
    }

    @RequestMapping(path = "/redirect", method = RequestMethod.POST)
    public String redirect(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("redirect");
        return "redirect:https://google.com";
    }

}
