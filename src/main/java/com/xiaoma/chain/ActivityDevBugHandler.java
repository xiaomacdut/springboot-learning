package com.xiaoma.chain;

/**
 * @author xiaomacdut
 * @date 2019年6月27日 下午8:59:05
 */
public class ActivityDevBugHandler extends BugHandler{
    
    @Override
    public String code(String name){
        String bug = "";
        if("activity-1".equals(name)){
            bug = "这个bug是活动组" + name + "的bug";
        }else{
            getBugHandler().code(name);
        }
        return bug;
    }
    
}
