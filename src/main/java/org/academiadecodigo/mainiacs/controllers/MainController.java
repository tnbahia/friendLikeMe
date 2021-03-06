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
        return "index1";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/contact","host/contact"})
    public String contact() {
        return "contact";
    }
}
