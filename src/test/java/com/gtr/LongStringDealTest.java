package com.gtr;
import com.gtr.tools.longStringDeal;
import org.junit.Test;


public class LongStringDealTest {
    @Test
    public void imgTest(){
        String s = "st|coll|coll|coll";
        longStringDeal ST = new longStringDeal();
        for (String i : ST.imageSplit(s)){
            System.out.println(i);
        }
    }
}
