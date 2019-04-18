package org.academiadecodigo.mainiacs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin(origins = "*")
@Controller
public class MainController {

    @RequestMapping(method = RequestMethod.GET, path = {"/",""})
    public String home() {
        System.out.println("ochja");
        return "index1";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/contact")
    public String contact() {
        System.out.println("ochja");
        return "contact";
    }
}
