package org.academiadecodigo.mainiacs.persistence.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="user")
public class User {

    private Integer id;
    private String name;
    private String email;
    private String phone;
    private Reserve reserve;



}
