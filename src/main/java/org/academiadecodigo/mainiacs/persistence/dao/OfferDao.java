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
    public OfferDao() {
    }

    private List<Offer> list = new LinkedList<>();

    public void add(Offer offer) {
        list.add(offer);
    }

    public List<Offer> getList() {
        System.out.println("List size " + list.size());
        if (list.isEmpty()) {
            Offer a = new Offer("Tiago",
                    "tiago@incrivel.com",
                    "123456789",
                    40,
                    "03-05-2019",
                    "10-05-2019",
                    "Porto");
            Offer b = new Offer("Bahia",
                    "bahia@top.com",
                    "12312332",
                    35,
                    "10-06-2019",
                    "10-07-2019",
                    "Porto");
            Offer c = new Offer("Mila",
                    "mila@fabulosa.com",
                    "12312332",
                    38,
                    "16-06-2019",
                    "30-08-2019",
                    "Porto");
            Offer d = new Offer("Fábio",
                    "fabio@theman.com",
                    "12312332",
                    40,
                    "20-06-2019",
                    "25-07-2019",
                    "Porto");

            list.add(a);
            list.add(b);
            list.add(c);
            list.add(d);
        }
        return list;
    }

}
