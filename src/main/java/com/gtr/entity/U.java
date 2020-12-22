package com.gtr.entity;

import org.apache.ibatis.type.Alias;

//用户类
@Alias("user")
public class U {
    private int Uid;                    //用户编号
    private String Uemail;              //邮箱
    private int Uidentitytype;          //证件类型
    private String Uidentitynumber;     //证件号
    private String Upassword;           //密码
    private String Hinterestid;         //收藏
    private String Hleaseid;            //发布
    private String Uname;               //用户名
    private String Uphone;              //手机号
    private String Uhead;               //头像

    public U() {}

    public void setUid(int uid) {
        Uid = uid;
    }

    public void setUemail(String uemail) {
        Uemail = uemail;
    }

    public void setUidentitytype(int uidentitytype) {
        Uidentitytype = uidentitytype;
    }

    public void setUidentitynumber(String uidentitynumber) {
        Uidentitynumber = uidentitynumber;
    }

    public void setUpassword(String upassword) {
        Upassword = upassword;
    }

    public void setHinterestid(String hinterestid) {
        Hinterestid = hinterestid;
    }

    public void setHleaseid(String hleaseid) {
        Hleaseid = hleaseid;
    }

    public void setUname(String uname) {
        Uname = uname;
    }

    public void setUphone(String uphone) {
        Uphone = uphone;
    }

    public void setUhead(String uhead) {
        Uhead = uhead;
    }

    public int getUid() {
        return Uid;
    }

    public String getUemail() {
        return Uemail;
    }

    public int getUidentitytype() {
        return Uidentitytype;
    }

    public String getUidentitynumber() {
        return Uidentitynumber;
    }

    public String getUpassword() {
        return Upassword;
    }

    public String getHinterestid() {
        return Hinterestid;
    }

    public String getHleaseid() {
        return Hleaseid;
    }

    public String getUname() {
        return Uname;
    }

    public String getUphone() {
        return Uphone;
    }

    public String getUhead() {
        return Uhead;
    }
}
