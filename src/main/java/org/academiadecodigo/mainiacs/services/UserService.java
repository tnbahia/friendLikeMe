package org.academiadecodigo.mainiacs.services;

import org.academiadecodigo.mainiacs.persistence.dao.OfferDao;
import org.academiadecodigo.mainiacs.persistence.models.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class UserService {
    private OfferDao offerDao = new OfferDao();

    public List<Offer> listServices() {
        List<Offer> offerList = new LinkedList<>();
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

    @Autowired
    public void setOfferDao(OfferDao offerDao) {
        this.offerDao = offerDao;
    }
}
