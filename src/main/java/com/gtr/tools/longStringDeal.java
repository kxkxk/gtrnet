package com.gtr.tools;

import com.gtr.tools.IF.imageAdd;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
@Component
public class longStringDeal implements imageAdd {

    @Override
    public List<String> imageSplit(String str) {
        String[] list = str.split("\\|");
        List<String> img = new ArrayList<>(Arrays.asList(list));
        return img;
    }

    @Override
    public String currentDate() {
            Date date = new Date();
            DateFormat df = new SimpleDateFormat("yyyyMMdd");
            return df.format(date);
    }
}
