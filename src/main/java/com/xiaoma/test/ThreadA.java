package com.xiaoma.test;

/**
 * @author xiaomacdut
 * @date 2020年2月4日 下午5:05:42
 */
public class ThreadA extends Thread{
    
    public ThreadA(String name){
        super(name);
    }
    
    @Override
    public void run(){
        synchronized(this){
            System.out.println("this:" + this);
            try{
                Thread.sleep(2000);// 使当前线程阻塞1秒
            }catch(InterruptedException e){
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " call notify()");
            this.notify();
        }
    }
}
