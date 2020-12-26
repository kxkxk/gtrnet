package com.gtr;

import com.gtr.Mapper.HouseMapper;
import com.gtr.Mapper.UserMapper;
import com.gtr.Service.User.TreasureService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GtrnetApplication.class)
public class CollectionTest {
    @Autowired
    TreasureService treasureService;
    @Test
    public void getC(){
        List<String> le = treasureService.getCollection(1);
        for (String i : le)
            System.out.println(i);
        System.out.println("getUserCollectionSuccess");
    }
    @Test
    public void addC(){
        String coll = "stx1";
        treasureService.addCollection(1,coll);
        System.out.println("sssssssssssucceed");
    }
    @Test
    public void addR(){
        String coll = "stt1";
        treasureService.addRelease(1,coll);
        System.out.println("ssssud");
    }
    @Test
    public void getR(){
        List<String> le = treasureService.getRelease(1);
        for (String i : le)
            System.out.println(i);
        System.out.println("getUserReleaseionSuccess");
    }
    @Test
    public void delC(){
        List<String> delist = new ArrayList<String>();
        delist.add("stt1");

        treasureService.delCollection(1,delist);

    }
    @Test
    public void delR(){
        List<String> delist = new ArrayList<String>();
        delist.add("zt");
        delist.add("ssd");
        treasureService.delRelease(1,delist);

    }
}
