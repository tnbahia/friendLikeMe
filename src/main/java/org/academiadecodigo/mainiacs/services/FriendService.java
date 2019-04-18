package org.academiadecodigo.mainiacs.services;


import org.academiadecodigo.mainiacs.persistence.dao.OfferDao;
import org.academiadecodigo.mainiacs.persistence.models.Offer;
import org.springframework.stereotype.Service;

@Service
public class FriendService {
    private OfferDao offerdao;


    public Offer save(Offer offer) {
        offerdao.add(offer);
        return offer;
    }
}