package com.rest.person.details;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class PersonDaoService
{
    private static Person person = new Person("Megan","Conoley",new Date());

    //complete details of a person
    public Person findPerson()
    {
        return person;
    }

    //if last_name is given find the other details
    public Person getDetails(String last_name)
    {
        if (person.getLast_name().equals(last_name))
        {
            return person;
        }
        return null;
    }
}
