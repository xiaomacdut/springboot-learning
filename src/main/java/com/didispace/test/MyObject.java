package com.didispace.test;

/**
 * @author xiaomacdut
 * @date 2019年5月12日 下午9:46:21
 */
public class MyObject{
    
    public static String NAME = "ASDF";
    
    public static int a = 1;
    
    public static void main(String [] args){
        String a = "";
        for(int i = 0; i < 10; i++){
            a = a + i;
            System.out.println(a);
        }
    }
    
}
