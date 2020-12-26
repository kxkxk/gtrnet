package com.gtr.tools;

import com.gtr.tools.IF.imageAdd;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class longStringDeal implements imageAdd {

    @Override
    public List<String> imageSplit(String str) {
        String[] list = str.split("\\|");
        List<String> img = new ArrayList<>(Arrays.asList(list));
        return img;
    }
}
