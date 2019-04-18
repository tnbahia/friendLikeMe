package org.academiadecodigo.mainiacs;

import org.academiadecodigo.mainiacs.controllers.RESTUserController;
import org.academiadecodigo.mainiacs.persistence.models.Offer;

public class Main {
    public static void main(String[] args) {
        RESTUserController r = new RESTUserController();
        System.out.println(((Offer)r.listAllHosts().getBody().get(0)).getName());
    }
}
