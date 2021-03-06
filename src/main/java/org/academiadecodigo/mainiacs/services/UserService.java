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
    private OfferDao offerDao;

    public List<Offer> listServices() {
        return offerDao.getList();
    }

    @Autowired
    public void setOfferDao(OfferDao offerDao) {
        this.offerDao = offerDao;
    }
}
