package com.xiaoma.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {

    /*public static void main(String[] arg) {
        new AnnotationConfigWebApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        Entitlement ent = (Entitlement)ctx.getBean("entitlement");
        System.out.println(ent.getName());
        System.out.println(ent.getTime());

        Entitlement ent2 = (Entitlement)ctx.getBean("entitlement2");
        System.out.println(ent2.getName());
        System.out.println(ent2.getTime());

        ctx.close();
    }*/


   public static void main(String[] args) {
       AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext("com.xiaoma.javaconfig");
       Person person=(Person) ctx.getBean(Person.class);
       person.print();
   }
}
