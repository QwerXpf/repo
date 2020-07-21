package cn.itcast.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class AccountMapperTest {

    @Autowired
     AccountMapper accountMapper;


    @Test
    public void transferIn(){
        accountMapper.transferIn("aaa",200);
    }

    @Test
    public void transferOut(){
        accountMapper.transferIn("bbb",200);
    }
}
