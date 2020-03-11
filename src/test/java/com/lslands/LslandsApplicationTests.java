package com.lslands;


import com.lslands.dao.TypeRepository;
import com.lslands.dao.UserRepository;
import com.lslands.mapper.TypeMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LslandsApplicationTests {

    @Autowired
    private TypeRepository typeRepository;

    @Autowired
    private UserRepository userRepository;



    @Test
   public void contextLoads() {


    }

}
