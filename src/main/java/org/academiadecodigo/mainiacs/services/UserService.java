package org.academiadecodigo.mainiacs.services;

import org.academiadecodigo.mainiacs.persistence.models.Service;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class UserService {
    public List<Service> listServices() {
        List<Service> serviceList = new LinkedList<>();
        Service s = new Service("Tiago",
                "ojicois",
                "09809123",
                new Date(2019,1,23),
                new Date(2019,2,26),
                "Porto");
        Service t = new Service("Bahia",
                "sdfs",
                "12312332",
                new Date(2019,4,23),
                new Date(2019,7,26),
                "Porto");

        serviceList.add(s);
        serviceList.add(t);
        return serviceList;
    }
}
