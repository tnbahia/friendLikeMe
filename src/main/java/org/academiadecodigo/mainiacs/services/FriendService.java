package org.academiadecodigo.mainiacs.services;


import org.academiadecodigo.mainiacs.persistence.dao.OfferDao;
import org.academiadecodigo.mainiacs.persistence.models.Offer;

public class FriendService {
    private OfferDao offerdao;


    public void save(Offer offer) {
        offerdao.add(offer);
    }
}