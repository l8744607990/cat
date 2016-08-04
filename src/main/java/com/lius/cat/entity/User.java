package com.lius.cat.entity;

import com.dexcoder.commons.pager.Pageable;
import com.dexcoder.dal.annotation.Table;

import java.util.Date;

/**
 * 用户实体类
 * User : liulu ,
 * Date : 2016-7-20 20:40 ,
 * version $Id: User.java, v 0.1 Exp $
 */
@Table(name = "CAT_USER", pkField = "userId")
public class User extends Pageable{

    private Long userId;

    private String code;

    private String name;

    private String phone;

    private String passwd;

    private Integer gender;

    private String email;

    private Date createTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (userId != user.userId) return false;
        if (code != null ? !code.equals(user.code) : user.code != null) return false;
        return phone != null ? phone.equals(user.phone) : user.phone == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", passwd='" + passwd + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
