package com.imooc.girl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: lidg
 * @Date: Creat in 2018/3/10 20:09
 */

// all we need is just an interface!
public interface GirlRepository extends JpaRepository<Girl, Integer> { // <className, Id type>

    // self extend, by age to find, must according the rules
    // default is by ID
    List<Girl> findByAge(Integer age);
}
