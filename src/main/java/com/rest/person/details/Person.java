package com.rest.person.details;

import java.util.Date;

public class Person {
    private String first_name;
    private String last_name;
    private Date present_date;

    public Person(String first_name, String last_name, Date present_date) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.present_date = present_date;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getPresent_date() {
        return present_date;
    }

    public void setPresent_date(Date present_date) {
        this.present_date = present_date;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", present_date=" + present_date +
                '}';
    }
}
