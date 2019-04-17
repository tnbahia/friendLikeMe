package org.academiadecodigo.mainiacs.persistence.dao;

import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class ServiceDao {

    @PersistenceContext
    private EntityManager em;

}
