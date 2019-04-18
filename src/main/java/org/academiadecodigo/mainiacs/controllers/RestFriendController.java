package org.academiadecodigo.mainiacs.controllers;


import org.academiadecodigo.mainiacs.persistence.models.Offer;
import org.academiadecodigo.mainiacs.services.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/host")
public class RestFriendController {

    private FriendService friendService;

    @RequestMapping(method = RequestMethod.POST, path = {"/", "","index.html"})
    public String addOffer(@RequestBody Offer offer) {

        friendService.save(offer);

        return "redirect:/";
    }

    @Autowired
    public void setFriendService(FriendService friendService) {
        this.friendService = friendService;
    }
}
