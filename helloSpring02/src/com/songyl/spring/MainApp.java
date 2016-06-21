package com.songyl.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
	//ClassPathXmlApplicationContext：该容器从 XML 文件中加载已被定义的 bean。
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	UserInfo userInfo1 = (UserInfo) context.getBean("userInfo1");
	System.out.println("Your ID:" + userInfo1.getUserId());
	System.out.println("Your NAME:" + userInfo1.getUserName());
	System.out.println("Your AGE:" + userInfo1.getAge());
	System.out.println("Your NOTE:" + userInfo1.getNotes());
	System.out.println("-----------------------------------------");
	UserInfo userInfo2 = (UserInfo) context.getBean("userInfo2");
	System.out.println("Your ID:" + userInfo2.getUserId());
	System.out.println("Your NAME:" + userInfo2.getUserName());
	System.out.println("Your AGE:" + userInfo2.getAge());
	System.out.println("Your NOTE:" + userInfo2.getNotes());

    }
}