package com.xiaoma.test;

import java.util.Date;

/**
 * @author xiaomacdut
 * @date 2020年2月4日 下午5:05:06
 */
public class WaitTest{
    
    public static void main(String [] args){
        ThreadA t1 = new ThreadA("t1");
        Object obj = new Object();
        System.out.println("t1:" + t1);
        synchronized(t1){
            try{
                // 启动线程
                System.out.println(Thread.currentThread().getName() + " start t1");
                t1.start();
                // 主线程等待t1通过notify唤醒。
                System.out.println(Thread.currentThread().getName() + " wait()" + new Date());
                t1.wait();// 不是使t1线程等待，而是当前执行wait的线程等待
                System.out.println(Thread.currentThread().getName() + " continue" + new Date());
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
