package com.gtr.entity;

import org.apache.ibatis.type.Alias;

//管理员类
@Alias("admin")
public class AD {
    private int ADid;                             //管理员编号
    private String ADemail;                       //邮箱
    private int ADidentitytype;                   //证件类型
    private String ADidentitynumber;              //证件号
    private String ADpassword;                    //密码
    private String Hinterestid;                   //收藏
    private String Hleaseid;                      //发布
    private String ADname;                        //用户名
    private String ADphone;                       //手机号
    private String ADhead;                        //头像
    public AD() {}
    public void setADid(int ADid) {
        this.ADid = ADid;
    }

    public void setADemail(String ADemail) {
        this.ADemail = ADemail;
    }

    public void setADidentitytype(int ADidentitytype) {
        this.ADidentitytype = ADidentitytype;
    }

    public void setADidentitynumber(String ADidentitynumber) {
        this.ADidentitynumber = ADidentitynumber;
    }

    public void setADpassword(String ADpassword) {
        this.ADpassword = ADpassword;
    }

    public void setHinterestid(String hinterestid) {
        Hinterestid = hinterestid;
    }

    public void setHleaseid(String hleaseid) {
        Hleaseid = hleaseid;
    }

    public void setADname(String ADname) {
        this.ADname = ADname;
    }

    public void setADphone(String ADphone) {
        this.ADphone = ADphone;
    }

    public void setADhead(String ADhead) {
        this.ADhead = ADhead;
    }

    public int getADid() {
        return ADid;
    }

    public String getADemail() {
        return ADemail;
    }

    public int getADidentitytype() {
        return ADidentitytype;
    }

    public String getADidentitynumber() {
        return ADidentitynumber;
    }

    public String getADpassword() {
        return ADpassword;
    }

    public String getHinterestid() {
        return Hinterestid;
    }

    public String getHleaseid() {
        return Hleaseid;
    }

    public String getADname() {
        return ADname;
    }

    public String getADphone() {
        return ADphone;
    }

    public String getADhead() {
        return ADhead;
    }
}
