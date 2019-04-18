package org.academiadecodigo.mainiacs.controllers;

import org.academiadecodigo.mainiacs.persistence.models.Offer;
import org.academiadecodigo.mainiacs.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/host")
public class RESTUserController {
    private UserService userService = new UserService();

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public ResponseEntity<List> listAllHosts() {
        List<Offer> offerList = userService.listServices();
        return new ResponseEntity<List>(offerList, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{city}")
    public ResponseEntity<List> searchHosts(@PathVariable String city) {
        List<Offer> offerList = userService.listServices();
        List<Offer> filteredList = new LinkedList<>();
        for (Offer offer : offerList) {
            if (offer.getCity().equals(city)) {
                filteredList.add(offer);
            }
        }
        return new ResponseEntity<List>(filteredList,HttpStatus.OK);
    }
}
