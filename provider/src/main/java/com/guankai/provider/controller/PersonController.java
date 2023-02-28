package com.guankai.provider.controller;

import com.guankai.api.domain.Person;
import com.guankai.api.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 描述：TODO
 *
 * @author guankai
 * @date 2023/2/28
 **/
@RestController
@RequestMapping("/provider/person")
public class PersonController {

    @Resource
    private PersonService personService;

    @GetMapping("/{id}")
    public Person getPersonInfo(@PathVariable("id") Long id){
        return personService.getById(id);
    }

}
