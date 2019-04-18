package org.academiadecodigo.mainiacs.persistence.dao;

import org.academiadecodigo.mainiacs.persistence.models.Offer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Component
@Repository
public class OfferDao {

    private List<Offer> list = new LinkedList<>();

    public void add (Offer offer) {
        System.out.println("addingOfferDAO\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("List size " + list.size());
        list.add(offer);
        System.out.println("List size " + list.size());
    }

    public List<Offer> getList() {
        System.out.println("List size " + list.size());
        Offer a = new Offer("Tiago",
                "ojicois",
                "09809123",
                40,
                "sa",
                "asd",
                "Porto");
        Offer b = new Offer("Bahia",
                "sdfs",
                "12312332",
                30,
                "sa",
                "asd",
                "Porto");
        Offer c = new Offer("Mila",
                "sdfs",
                "12312332",
                30,
                "sa",
                "asd",
                "Porto");
        Offer d = new Offer("Fábio",
                "sdfs",
                "12312332",
                30,
                "sa",
                "asd",
                "Porto");

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        return list;
    }

}
