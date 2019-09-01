package com.xiaoma.web;

/**
 * @author xiaomacdut
 * @date 2019年4月27日 上午9:06:31
 */
public class TestThreadLocal{
    
    ThreadLocal<String> stringLocal = new ThreadLocal<String>();
    
    public void set(){
        stringLocal.set(Thread.currentThread().getName() + "aa");
    }
    
    
    public String getString(){
        return stringLocal.get();
    }
    
    public static void main(String [] args) throws InterruptedException{
        final TestThreadLocal test = new TestThreadLocal();
        test.set();
        System.out.println("0:" + test.getString());
        Thread thread = new Thread(){
            public void run(){
                test.set();
                System.out.println("1:" + test.getString());
            };
        };
        
        thread.start();
        thread.join();// main线程等到其他多个线程执行完毕后再继续执行
        
        System.out.println("2:" + test.getString());
        
    }
}
