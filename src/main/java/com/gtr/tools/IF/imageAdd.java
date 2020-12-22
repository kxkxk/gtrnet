package com.gtr.tools.IF;

import java.util.List;

public interface imageAdd {                         //拆分图片地址，返回一个String list,分隔符为“|”
    List<String> imageSplit(String str);
}
