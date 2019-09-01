package com.didispace.test;

import java.util.Random;

/**
 * @author xiaomacdut
 * @date 2019年7月10日 下午10:22:02
 */
public class ThreadLocalExample{
    
    public static class MyRunnable implements Runnable{
        
        private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
        
        @Override
        public void run(){
            threadLocal.set(new Random().nextInt(10));
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
            }
            
            System.out.println(threadLocal.get());
        }
    }
    
    public static void main(String [] args) throws InterruptedException{
        MyRunnable sharedRunnableInstance = new MyRunnable();
        
        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance);
        
        thread1.start();
        thread2.start();
        
        thread1.join(); // wait for thread 1 to terminate
        thread2.join(); // wait for thread 2 to terminate
    }
}
