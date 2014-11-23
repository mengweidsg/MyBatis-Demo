package com.pfs.pojo;


/**
 * &#x7528;&#x6237;&#x7c7b;
 *
 * @author db2admin
 *
 */
public class User  {
    private String username;
    private String password;
    private Integer age;
    public String getUserName() {
        return username;
    }
    public void setUserName(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public User() {
    }

}  