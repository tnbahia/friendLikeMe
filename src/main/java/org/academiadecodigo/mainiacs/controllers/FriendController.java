package org.academiadecodigo.mainiacs.controllers;

import org.academiadecodigo.mainiacs.persistence.models.Offer;
import org.academiadecodigo.mainiacs.services.FriendService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@Controller
@RequestMapping("/api/host")
public class FriendController {
    private FriendService friendService;


    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public String addOffer(@Valid @ModelAttribute Offer offer, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return "api/host";
        }

        friendService.save(offer);
        // get help from the framework building the path for the newly created resource
        //UriComponents uriComponents = uriComponentsBuilder.path("/api/host/" + offer..build();


        // set headers with the created path
        //HttpHeaders headers = new HttpHeaders();
        //headers.setLocation(uriComponents.toUri());

        return new ResponseEntity<>(HttpStatus.CREATED);
    }




    @RequestMapping(method = RequestMethod.POST, path = {"/", ""}, params = "action=save")
    public String saveCustomer(@Valid @ModelAttribute("customer") Offer offer, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return "api/host";
        }

        Customer savedCustomer = customerService.save(customerDtoToCustomer.convert(customerDto));

        redirectAttributes.addFlashAttribute("lastAction", "Saved " + savedCustomer.getFirstName() + " " + savedCustomer.getLastName());
        return "redirect:/customer/" + savedCustomer.getId();
}
