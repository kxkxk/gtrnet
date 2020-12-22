package com.gtr.entity;

import org.apache.ibatis.type.Alias;

//小区类
@Alias("rq")
public class RQ {
    private int RQid;                                     //小区编号
    private String RQname;                                //小区名称
    private String RQintroduce;                           //小区介绍
    private String RQimage;                               //图片
    public RQ(){

    }
    public void setRQid(int RQid) {
        this.RQid = RQid;
    }

    public void setRQname(String RQname) {
        this.RQname = RQname;
    }

    public void setRQintroduce(String RQintroduce) {
        this.RQintroduce = RQintroduce;
    }

    public void setRQimage(String RQimage) {
        this.RQimage = RQimage;
    }

    public int getRQid() {
        return RQid;
    }

    public String getRQname() {
        return RQname;
    }

    public String getRQintroduce() {
        return RQintroduce;
    }

    public String getRQimage() {
        return RQimage;
    }


}
