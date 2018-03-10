package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Optional;

/**
 * @Author: lidg
 * @Date: Creat in 2018/3/10 20:06
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;
    /**
     * get all girls
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        return girlRepository.findAll();
    }

    /**
     * add a girl
     * @param cupSize
     * @param age
     * @return
     */
    // postman: form-data
    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                          @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    // get a girl
    @GetMapping(value="/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id) {
        Optional<Girl> op =  girlRepository.findById(id);
        if (op.isPresent()) {
            return op.get();
        }
        return null;
    }
    // mod a girl
    // postman: must be : x-www-form-urlencoded
    @PutMapping(value="/girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        girl.setId(id);
        return girlRepository.save(girl);
    }
    // delete a girl
    @DeleteMapping(value="/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id) {
        girlRepository.deleteById(id);
    }

    // query girl list by age
    @GetMapping(value="/girls/age/{age}")
    public List<Girl> girListByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }

    // transaction
    @PostMapping(value="/girls/two")
    public void girlTwo() {
        girlService.insertTwo();
    }

}
