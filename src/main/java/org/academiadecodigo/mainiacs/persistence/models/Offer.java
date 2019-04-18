package org.academiadecodigo.mainiacs.persistence.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "offers")
public class Offer {
    private String name;
    private String email;
    private String phone;
    private int price;
    private String startDate;
    private String endDate;
    private String city;

    public Offer(){

    }

    public Offer(String name, String email, String phone, int price, String startDate, String endDate, String city) {

        this.name = name;
        this.email = email;
        this.phone = phone;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
        this.city = city;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
