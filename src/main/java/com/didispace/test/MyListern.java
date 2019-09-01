package com.didispace.test;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author xiaomacdut
 * @date 2019年7月14日 下午8:56:46
 */
// @Component
public class MyListern implements ApplicationListener<ApplicationEvent>{
    
    @Override
    public void onApplicationEvent(ApplicationEvent event){
        System.out.println("哈哈");
        
    }
    
}
