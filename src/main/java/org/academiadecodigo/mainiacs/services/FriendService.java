package org.academiadecodigo.mainiacs.services;


import org.academiadecodigo.mainiacs.persistence.dao.OfferDao;
import org.academiadecodigo.mainiacs.persistence.models.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendService {
    private OfferDao offerDao;

    public void save(Offer offer) {
        System.out.println("saving\n\n\n\n\n\n\n\n\n\n\n");
        offerDao.add(offer);
    }

    @Autowired
    public void setOfferDao(OfferDao offerDao) {
        this.offerDao = offerDao;
    }
}