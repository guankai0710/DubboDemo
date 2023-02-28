package com.guankai.consumer.controller;

import com.guankai.api.domain.Person;
import com.guankai.api.service.PersonService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：TODO
 *
 * @author guankai
 * @date 2023/2/28
 **/
@RestController
@RequestMapping("/consumer/person")
public class PersonController {

    @DubboReference
    private PersonService personService;

    @RequestMapping("/{id}")
    public Person getUser(@PathVariable("id") Long id) {
        return personService.getById(id);
    }
}
