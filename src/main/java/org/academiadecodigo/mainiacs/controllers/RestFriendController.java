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

@Controller
@RestController
@RequestMapping("/api/host")
public class RestFriendController {

    private FriendService friendService;

    @Autowired
    public void setFriendService(FriendService friendService) {
        this.friendService = friendService;
    }


    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public ResponseEntity<Offer> addOffer(@Valid @RequestBody Offer offer, BindingResult bindingResult, UriComponentsBuilder uriComponentsBuilder) {

        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Offer offer1 = friendService.save(offer);
        // get help from the framework building the path for the newly created resource
        //UriComponents uriComponents = uriComponentsBuilder.path("/api/host/" + offer1.build();


        // set headers with the created path
        //HttpHeaders headers = new HttpHeaders();
        //headers.setLocation(uriComponents.toUri());

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
