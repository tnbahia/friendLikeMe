package org.academiadecodigo.mainiacs.controllers;

import org.academiadecodigo.mainiacs.models.Service;
import org.academiadecodigo.mainiacs.services.UserService;
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

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public ResponseEntity<List> listHosts() {
        List<Service> serviceList = userService.listServices();
        return new ResponseEntity<List>(serviceList, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{city}")
    public ResponseEntity<List> searchHosts(@PathVariable String city) {
        List<Service> serviceList = userService.listServices();
        List<Service> filteredList = new LinkedList<>();
        for (Service service: serviceList) {
            if (service.getCity() == city) {
                filteredList.add(service);
            }
        }
        return new ResponseEntity<List>(filteredList,HttpStatus.OK);
    }
}
