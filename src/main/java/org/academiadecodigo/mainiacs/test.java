package org.academiadecodigo.mainiacs;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class test {

    public static void main(String[] args) throws ParseException {

        String a = "10/05/2019";
        String b = "29/01/2020";

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        Date inittDate = format.parse(a);
        Date finishDate = format.parse(b);

        long dif = (finishDate.getTime() - inittDate.getTime())/1000/60/60/24;

        System.out.println(dif);




    }
}
