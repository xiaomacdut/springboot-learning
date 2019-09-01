package com.didispace.chain;

/**
 * @author xiaomacdut
 * @date 2019年6月27日 下午8:59:37
 */
public class GatewayDevBugHandler extends BugHandler{
    
    @Override
    public String code(String code){
        String bug = "";
        if("geteway-1".equals(code)){
            setBugHandler(new MobileDevBugHandler());
        }else{
            getBugHandler().code(code);
        }
        return bug;
    }
    
}
