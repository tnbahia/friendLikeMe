package org.academiadecodigo.mainiacs.services;

import org.academiadecodigo.mainiacs.persistence.models.Offer;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class UserService {
    public List<Offer> listServices() {
        List<Offer> offerList = new LinkedList<>();
        Offer s = new Offer("Tiago",
                "ojicois",
                "09809123",
                new Date(2019,1,23),
                new Date(2019,2,26),
                "Porto");
        Offer t = new Offer("Bahia",
                "sdfs",
                "12312332",
                new Date(2019,4,23),
                new Date(2019,7,26),
                "Porto");

        offerList.add(s);
        offerList.add(t);
        return offerList;
    }
}
