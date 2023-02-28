package com.guankai.provider.serviceimpl;

import com.guankai.api.domain.Person;
import com.guankai.api.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * 描述：TODO
 *
 * @author guankai
 * @date 2023/2/28
 **/
@DubboService
@Slf4j
@Component
public class PersonServiceImpl implements PersonService {

    public Person getById(Long id) {
        return new Person(1L,"ryan",18);
    }
}
