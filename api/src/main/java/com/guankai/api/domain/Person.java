package com.guankai.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 描述：TODO
 *
 * @author guankai
 * @date 2023/2/28
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {

    private static final long serialVersionUID = 8146360686070383539L;

    private Long id;
    private String name;
    private Integer age;

}
