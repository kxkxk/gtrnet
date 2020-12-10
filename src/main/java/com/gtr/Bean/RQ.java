package com.gtr.Bean;

import org.apache.ibatis.type.Alias;

//小区类
@Alias("rq")
public class RQ {
    int RQid;
    String RQname;
    String RQintroduce;
    String RQimage;
}
