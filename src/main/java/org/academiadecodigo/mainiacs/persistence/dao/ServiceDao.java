package org.academiadecodigo.mainiacs.persistence.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ServiceDao {

    @PersistenceContext
    private EntityManager em;



}
