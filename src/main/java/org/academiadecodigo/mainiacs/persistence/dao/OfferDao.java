package org.academiadecodigo.mainiacs.persistence.dao;

import org.academiadecodigo.mainiacs.persistence.models.Offer;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class OfferDao {

    @PersistenceContext
    private EntityManager em;

    private List<Offer> list;

    public void add (Offer offer) {
        list.add(offer);
    }

}
