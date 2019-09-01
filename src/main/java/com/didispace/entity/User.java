package com.didispace.entity;

/**
 * @author xiaomacdut
 * @date 2019年9月1日 上午9:29:41
 */
public class User{
    
    private String userName;
    private String passWord;
    
    
    /**
     * @return the passWord
     */
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
