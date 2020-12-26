package com.gtr;

import com.gtr.entity.H;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GtrnetApplication.class)
public class PageTest {
    @Autowired
    H house;
    @Test
    public void selectHouseTest(){
        house.setHname("新房");
    }
}













