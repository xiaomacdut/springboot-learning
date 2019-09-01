package com.xiaoma.chain;

/**
 * @author xiaomacdut
 * @date 2019年6月27日 下午9:01:54
 */
public class Main{
    
    public static void main(String [] args){
        BugHandler bugHandler1 = new ActivityDevBugHandler();
        BugHandler bugHandler2 = new GatewayDevBugHandler();
        BugHandler bugHandler3 = new MobileDevBugHandler();
        
        bugHandler3.setBugHandler(bugHandler2);
        bugHandler2.setBugHandler(bugHandler1);
        String str = bugHandler1.code("activity-1");
        System.out.println(str);
    }
}
