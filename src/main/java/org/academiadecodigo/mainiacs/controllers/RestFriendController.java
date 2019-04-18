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

@RestController
@RequestMapping("/api/host")
public class RestFriendController {

    private FriendService friendService;

    @RequestMapping(method = RequestMethod.POST, path = {"/", "","index.html"})
    public String addOffer(@RequestBody Offer offer) {

        /*if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }*/
        System.out.println("addingOffer\n\n\n\n\n\n\n\n\n\n\n");

        friendService.save(offer);
        // get help from the framework building the path for the newly created resource
        //UriComponents uriComponents = uriComponentsBuilder.path("/api/host/" + offer..build();


        // set headers with the created path
        //HttpHeaders headers = new HttpHeaders();
        //headers.setLocation(uriComponents.toUri());

        return "redirect:/index.html";
    }

    @Autowired
    public void setFriendService(FriendService friendService) {
        this.friendService = friendService;
    }
}
