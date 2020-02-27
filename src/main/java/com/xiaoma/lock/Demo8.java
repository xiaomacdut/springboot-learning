package com.xiaoma.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xiaomacdut
 * @date 2020年2月7日 下午2:20:30
 */
@Slf4j
public class Demo8{
    
    public static void main(String [] args) throws InterruptedException{
        // 非公平锁
        test1(false);
        TimeUnit.SECONDS.sleep(4);
        log.info("------------------------------");
        // 公平锁
        test1(true);
    }
    
    public static void test1(boolean fair) throws InterruptedException{
        ReentrantLock lock = new ReentrantLock(fair);
        
        Thread t1 = new Thread(()-> {
            lock.lock();
            try{
                log.info("start");
                TimeUnit.SECONDS.sleep(3);
                new Thread(()-> {
                    m1(lock, "son");
                }).start();
                log.info("end");
            }catch(InterruptedException e){
                e.printStackTrace();
            }finally{
                lock.unlock();
            }
        });
        
        t1.setName("t1");
        t1.start();
        TimeUnit.SECONDS.sleep(1);
        m1(lock, "father");
    }
    
    public static void m1(ReentrantLock lock, String threadPre){
        for(int i = 0; i < 10; i++){
            Thread thread = new Thread(()-> {
                lock.lock();
                try{
                    log.info("获取到锁!");
                }finally{
                    lock.unlock();
                }
            });
            
            thread.setName(threadPre + "-" + i);
            thread.start();
        }
    }
}