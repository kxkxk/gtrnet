package com.gtr;

import com.gtr.Service.House.HouseService;
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
    HouseService houseService;
    @Test
    public void selectHouseTest(){
        H house = new H();
        house.setHname("房");
        house.setRQid(1);
        System.out.println(houseService.selectHouse(house).get(0).getHname()+"dasfaffaf");
    }
}













