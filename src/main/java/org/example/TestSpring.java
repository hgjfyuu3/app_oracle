package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TestBean testBean = context.getBean("Kirill", TestBean.class);

        System.out.println(testBean.getName());

        testBean = context.getBean("Marina", TestBean.class);

        System.out.println(testBean.getName());

        context.close();
    }
}
