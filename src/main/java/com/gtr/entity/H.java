package com.gtr.entity;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

//房屋类
@Alias("house")
public class H implements Serializable {
    private int Hid;                                            //房屋编号
    private int RQid;                                           //小区编号
    private String Hname;                                       //房屋名称
    private int Hrent;                                          //租金
    private String Haddress;                                    //地址
    private String Hmethod;                                     //租赁方式
    private String Hstructure;                                  //结构
    private String Hfloorface;                                  //楼层朝向
    private String Himage;                                      //图片地址
    private String Hintroduce;                                  //介绍
    public H() {

    }
    public int getHid() {
        return Hid;
    }

    public void setHid(int hid) {
        Hid = hid;
    }

    public int getRQid() {
        return RQid;
    }

    public void setRQid(int RQid) {
        this.RQid = RQid;
    }

    public String getHname() {
        return Hname;
    }

    public void setHname(String hname) {
        Hname = hname;
    }

    public int getHrent() {
        return Hrent;
    }

    public void setHrent(int hrent) {
        Hrent = hrent;
    }

    public String getHaddress() {
        return Haddress;
    }

    public void setHaddress(String haddress) {
        Haddress = haddress;
    }

    public String getHmethod() {
        return Hmethod;
    }

    public void setHmethod(String hmethod) {
        Hmethod = hmethod;
    }

    public String getHstructure() {
        return Hstructure;
    }

    public void setHstructure(String hstructure) {
        Hstructure = hstructure;
    }

    public String getHfloorface() {
        return Hfloorface;
    }

    public void setHfloorface(String hfloorface) {
        Hfloorface = hfloorface;
    }

    public String getHimage() {
        return Himage;
    }

    public void setHimage(String himage) {
        Himage = himage;
    }

    public String getHintroduce() {
        return Hintroduce;
    }

    public void setHintroduce(String hintroduce) {
        Hintroduce = hintroduce;
    }
    public void testPrent(){
        System.out.println(this.Hid+"//"+this.Hname+"//"+this.RQid+"//"+this.Hrent+"//"+this.Haddress+"//"+this.Hfloorface+"//"+this.Himage);
    }
}
