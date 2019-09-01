package com.didispace.test;

import java.util.concurrent.CountDownLatch;

/**
 * @author xiaomacdut
 * @date 2019年8月4日 下午8:57:56
 */
public class VolatileDemo{
    
    private static volatile int value;
    private static CountDownLatch countDownLatch = new CountDownLatch(10000);
    
    public static void main(String [] args) throws Exception{
        for(int i = 0; i < 10000; i++){
            new Thread(){
                
                @Override
                public void run(){
                    increment();
                    countDownLatch.countDown();
                }
            }.start();
            
        }
        countDownLatch.await();
        System.out.println(getValue());
    }
    
    public synchronized static int increment(){
        return value++;
    }
    
    public static int getValue(){
        return value;
    }
}
