package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.event.TransactionalEventListener;

import javax.transaction.TransactionScoped;


/**
 * @Author: lidg
 * @Date: Creat in 2018/3/10 21:08
 */

// transation
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    /**
     * 1. not javax.transaction, it's spring framework'
     * 2. the table's engine must be innoDB, it supports transaction
     * 3. by defautl, jpa is MyISAM, it not support transaction, so we should alter
     *  the table manuall. i cannot find the config is application.yml
     * 4. NVcat is the best sql-client tool, very useful!
     */
    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("BBB");
        girlB.setAge(29);
        girlRepository.save(girlB);
    }

}
