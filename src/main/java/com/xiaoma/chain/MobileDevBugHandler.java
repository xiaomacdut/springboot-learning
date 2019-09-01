package com.xiaoma.chain;

/**
 * @author xiaomacdut
 * @date 2019年6月27日 下午9:00:08
 */
public class MobileDevBugHandler extends BugHandler{
    
    @Override
    public String code(String code){
        String bug = "";
        if("mobile-1".equals(code)){
            bug = "这个bug是app移动组" + code + "的bug";
        }else{
            getBugHandler().code(code);
        }
        return bug;
    }
    
}
