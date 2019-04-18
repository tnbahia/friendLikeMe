package org.academiadecodigo.mainiacs.persistence.dao;

import org.academiadecodigo.mainiacs.persistence.models.Offer;
import org.academiadecodigo.mainiacs.services.UserService;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class OfferDao {

    private UserService userService;

    private List<Offer> offerList;

    public void add (Offer offer) {
        userService.addOffer(offer);
    }

    public List<Offer> list() {
        Offer s = new Offer("Tiago",
                "ojicois",
                "09809123",
                40,
                new Date(2019,1,23),
                new Date(2019,2,26),
                "Porto");
        Offer t = new Offer("Bahia",
                "sdfs",
                "12312332",
                30,
                new Date(2019,4,23),
                new Date(2019,7,26),
                "Porto");

        offerList.add(s);
        offerList.add(t);
        return offerList;
    }

}
