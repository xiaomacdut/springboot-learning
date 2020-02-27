package com.xiaoma.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author xiaomacdut
 * @date 2019年9月1日 上午9:29:41
 */
@Entity
@Table(name = "tb_user")
public class User{
    
    private String id;
    private String userName;
    private String passWord;
    
    
    /**
     * @return the id
     */
    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    public String getId(){
        return id;
    }
    
    
    /**
     * @param id the id to set
     */
    public void setId(String id){
        this.id = id;
    }
    
    
    /**
     * @return the passWord
     */
    @Column(name = "password", nullable = true)
    public String getPassWord(){
        return passWord;
    }
    
    
    /**
     * @param passWord the passWord to set
     */
    public void setPassWord(String passWord){
        this.passWord = passWord;
    }
    
    
    /**
     * @return the userName
     */
    @Column(name = "username", nullable = false)
    public String getUserName(){
        return userName;
    }
    
    
    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName){
        this.userName = userName;
    }
    
}
