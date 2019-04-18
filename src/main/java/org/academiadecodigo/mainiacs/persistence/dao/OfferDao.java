package org.academiadecodigo.mainiacs.persistence.dao;

import org.academiadecodigo.mainiacs.persistence.models.Offer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OfferDao {

    private List<Offer> list;

    public void add (Offer offer) {
        list.add(offer);
    }

}
