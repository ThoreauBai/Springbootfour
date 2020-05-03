package com.example.demo.bean.familybean;

import java.io.Serializable;

/****
 *
 *
 *
 * 1111111111111
 */
public class p_shopEntity implements Serializable {
    private String username;
    private String userpassword;
    private String userpw; //密码

    public p_shopEntity() {
    }

    private String userphone;
    private String userstate;
    private String carid;

    public p_shopEntity(String username, String userpassword, String userpw, String userphone, String userstate, String carid) {
        this.username = username;
        this.userpassword = userpassword;
        this.userpw = userpw;
        this.userphone = userphone;
        this.userstate = userstate;
        this.carid = carid;
    }

    @Override
    public String toString() {
        return "PShopUser{" +
                "username='" + username + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", userpw='" + userpw + '\'' +
                ", userphone='" + userphone + '\'' +
                ", userstate='" + userstate + '\'' +
                ", carid='" + carid + '\'' +
                '}';
    }


    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUserpw() {
        return userpw;
    }

    public void setUserpw(String userpw) {
        this.userpw = userpw;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getUserstate() {
        return userstate;
    }

    public void setUserstate(String userstate) {
        this.userstate = userstate;
    }
}