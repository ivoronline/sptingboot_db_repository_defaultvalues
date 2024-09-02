package com.ivoronline.controller;

import com.ivoronline.entity.Person;
import com.ivoronline.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired PersonRepository personRepository;

  //================================================================
  // GET PERSON
  //================================================================
  @RequestMapping("AddPerson")
  String addPerson() {

    //CREATE ENTITY
    Person person      = new Person(); //name = "unknown"
           person.age  = 20;

    //SAVE ENTITY
    personRepository.save(person);

    //RETURN ENTITY
    return person.name + " is " + person.age + " years old";

  }

}

