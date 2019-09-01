package com.xiaoma.web;

import java.util.List;

/**
 * @author xiaomacdut
 * @date 2019年4月13日 下午9:37:13
 */
public class Person{
    
    private String name;
    private List<String> type;
    
    
    /**
     * @return the type
     */
    public List<String> getType(){
        return type;
    }
    
    
    /**
     * @param type the type to set
     */
    public void setType(List<String> type){
        this.type = type;
    }
    
    
    /**
     * @return the name
     */
    public String getName(){
        return name;
    }
    
    
    /**
     * @param name the name to set
     */
    public void setName(String name){
        this.name = name;
    }
    
    
    @Override
    public String toString(){
        return "Person [name=" + name + "]";
    }
    
    
}
