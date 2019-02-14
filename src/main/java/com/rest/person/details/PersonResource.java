package com.rest.person.details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonResource
{
    @Autowired
    private PersonDaoService service;

    @GetMapping("/person")
    public Person getPersonDetails()
    {
    return   service.findPerson();
    }

    @GetMapping("/person/{last_name}")
    public Person retrievePerson(@PathVariable String last_name)
    {
        return service.getDetails(last_name);
    }
}
