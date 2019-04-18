package org.academiadecodigo.mainiacs.persistence.dao;

import org.academiadecodigo.mainiacs.persistence.models.Offer;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Repository
public class OfferDao {

    private List<Offer> list = new LinkedList<>();

    public void add (Offer offer) {
        list.add(offer);
    }

    public List<Offer> getList() {
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

        list.add(s);
        list.add(t);
        return list;
    }

}
