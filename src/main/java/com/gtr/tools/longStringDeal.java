package com.gtr.tools;

import com.gtr.tools.IF.imageAdd;

import java.util.ArrayList;
import java.util.List;

public class longStringDeal implements imageAdd {

    @Override
    public List<String> imageSplit(String str) {
        String[] list = str.split("\\|");
        List<String> img = new ArrayList<>();
        for(int i = 0; i < list.length; i++) {
            img.add(list[i]);
        }
        return img;
    }
}
