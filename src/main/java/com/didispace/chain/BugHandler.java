package com.didispace.chain;

/**
 * @author xiaomacdut
 * @date 2019年6月27日 下午8:58:38
 */
public abstract class BugHandler{
    
    protected BugHandler bugHandler;
    
    public abstract String code(String code);
    
    
    public BugHandler getBugHandler(){
        return bugHandler;
    }
    
    public void setBugHandler(BugHandler bugHandler){
        this.bugHandler = bugHandler;
    }
}
