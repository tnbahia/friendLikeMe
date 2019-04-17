package org.academiadecodigo.mainiacs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class HostService {

    private Host host;


    public long convertDate() throws ParseException {

        host.setInitDate("10/05/2019");
        host.setFinishDate("29/05/2019");

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        Date inittDate = format.parse(host.getInitDate());
        Date finishDate = format.parse(host.getFinishDate());

        long dif = (finishDate.getTime() - inittDate.getTime())/1000/60/60/24;

        return dif;


    }

}
