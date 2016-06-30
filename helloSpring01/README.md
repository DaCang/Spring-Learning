## Spring 框架搭建步骤
### 第 1 步：添加所依赖的 JAR 包
### 第 2 步：创建 Java 项目并新建实体类 ([HelloSpring.java](https://github.com/DaCang/Spring-Learning/blob/master/helloSpring01/src/com/songyl/spring/HelloSpring.java))
>主要是 getter() 和  setter() 方法

### 第 3 步：创建 bean 的配置文件([Beans.xml](https://github.com/DaCang/Spring-Learning/blob/master/helloSpring01/src/Beans.xml))
* <pre><code>&lt;!-- id="helloSpring" 唯一标识 --&gt;
&lt;!-- class="com.songyl.spring.HelloSpring" 所映射的类
     这个属性是强制性的，并且指定用来创建 bean 的 bean 类  --&gt;
&lt;bean id="helloSpring" class="com.songyl.spring.HelloSpring"&gt;
      &lt;property name="message" value="Hello Spring!"/&gt;
</code></pre>

#### 第 4 步：新建测试类 ([MainApp.java](https://github.com/DaCang/Spring-Learning/blob/master/helloSpring01/src/com/songyl/spring/MainApp.java))

+ 使用框架 API ClassPathXmlApplicationContext() 来创建应用程序的上下文
    <pre><code>ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");</code></pre>

+ 使用已创建的上下文的 getBean() 方法来获得所需的 bean
    <pre><code>HelloSpring obj = (HelloSpring) context.getBean("helloSpring");</code></pre>


