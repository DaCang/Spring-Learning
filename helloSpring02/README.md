### 创建了两个bean类,并实例化
>in [Beans.xml](https://github.com/DaCang/Spring-Learning/blob/master/helloSpring02/src/Beans.xml)
	
	<!-- id="userInfo1" 唯一标识 -->
       <bean id="userInfo1" class="com.songyl.spring.UserInfo" >
          <property name="userId" value="1"/>
          <property name="userName" value="Tom"/>
          <property name="age" value="25"/>
          <property name="notes" value="Hello Tom!"/>
      </bean>
      <bean id="userInfo2" class="com.songyl.spring.UserInfo">
          <property name="userId" value="2"/>
          <property name="userName" value="Jack"/>
          <property name="age" value="25"/>
          <property name="notes" value="Hello Jack!"/>
      </bean>
>in [MainApp.java](https://github.com/DaCang/Spring-Learning/blob/master/helloSpring02/src/com/songyl/spring/MainApp.java)
	
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	UserInfo userInfo1 = (UserInfo) context.getBean("userInfo1");
	System.out.println("Your ID:" + userInfo1.getUserId());
	
