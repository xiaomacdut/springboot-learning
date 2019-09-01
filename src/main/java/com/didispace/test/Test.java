package com.didispace.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaomacdut
 * @date 2019年5月12日 下午9:46:02
 */
public class Test{
    
    private static Lock lock = new ReentrantLock();
    public static void main(String [] args){
        
        lock.lock();
        try{
        }finally{
            lock.unlock();
        }
        
    }
}
