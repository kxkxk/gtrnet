package com.gtr;
import com.gtr.tools.longStringDeal;
import org.junit.jupiter.api.Test;

public class LongStringDealTest {
    @Test
    public void imgTest(){
        String s = "./sdafs|/dsffssfs|/sdfsf|/fssfs";
        longStringDeal ST = new longStringDeal();
        for (String i : ST.imageSplit(s)){
            System.out.println(i);
        }
    }
}
