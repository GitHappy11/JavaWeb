# JavaWeb学习笔记

**Git项目：FristJavaWeb**

#### 1.初识XML

XML文件开头必须是XML声明

然后是其他约束规则

再然后就是根元素 和 元素

**约束文档**

（1）DTD约束文档

分为内部引入，外部引入，外部引入（网络）

（2）Schema约束文档

可以同时用两个约束文档，如果有重复的约束条件，可以使用命名空间区分

详情请看FristJavaWeb项目。

**Dom4J解析建立XML文档**

详情请看FristJavaWeb项目。

实际项目在暗黑战神项目中有应用到。

#### 2.在Jsp文件中写Java代码

```Java
//引入包的形式
<%@ page import="javax.xml.crypto.Data" %>
<%@ page import="java.util.Date" %>
```

```java
<%!int count=0;  %> //属于Java自定义变量代码块
 //和在Java代码部分定义有什么区别？答：这里面定义的是成员（全局）变量，在网页上会保存下来，而直接写在java代码部分的属于局部变量，每当刷新网页就会初始化。
    
<% out.println("Hello World") %>  //属于Java代码部分，不带System，会在网页上显示
    
<%=str+Show()%>
//内容输出表达式，可以直接输出字符串和执行方法

http://localhost:8080/FirstJavaWeb_war_exploded/index.jsp?username="Happy11"&password=111
//在网址最后+?+变量名+内容 可以给服务端传参数
out.println(request.getParameter("username"));
out.println(request.getParameter("password"));
//然后服务端用Request方法来接收这个参数

```

```html
 <!--一个登陆示例--> 
<form action="数据传输到哪个文件（这里可以是Jsp也可以是Servlet）" method="传输方式">
    <input type="类型" name="该Input的名称"/>
    <input type="password" name="password"/>
     <!-- radio表示单选，名字一样的就是和哪个一起单选 然后标签里面的Value值就是传输到服务器的值--> 
  性别：男<input type="radio" name="sex" value="男性"/>女<input type="radio" name="sex" value="女性"/>
     <!--一个提交按钮--> 
    <input type="submit"/>
</form>
 <!--上面传输过来的参数。都会保存在Request里，随时在任何文件内调用--> 
```

#### Request

每个分支网页都会有一个，在网页之间相互传递信息和存储信息

**生命周期：**一个请求生成和下一个请求生成

#### 3.Session

在用户的访问及服务器的回应（可能不止一次）就是会话，直到用户关闭网页。每一个客户端对应着一个Session。这个就类似于一个全局的Request，不需要再对象里传来传去。直接可以调用。

```java
//利用Session来存储数据 操作类似于Request 
session.setAttribute("user",user);
```

**生命周期：**打开一个会话的时候和关闭会话。

#### 4.Application

本质上是一个ServetContext 类 可以new。

整个服务器的Jsp就是一个新建的ServetContext。相当于核心存储信息。

存储一些于所有客户端都有关系的消息。所有客户端共享且相同。

**生命周期：**打开服务器和关闭服务器。

#### 5.Servlet

本质上就是一个类继承了HttpServlet。

然后在类的头上写

```jAva
@WebServlet(name = "RegisterServlet（类名）", value = "/RegisterServlet（类的路径）"
```

然后可以在相应的类（doPost）来写Java代码

和上面一样，接收消息处理消息。

#### 6.Web.xml

配置书写规则以及一些文件（Servlet）的访问路径

该文件路径

D:\Work\JavaWebData\Tomcat\apache-tomcat-9.0.41\webapps\examples\WEB-INF

#### 7.请求转发和重定向

```java
//（请求转发）跳转至登录界面，然后把两个消息包发送给它，让它去处理 这里不会重新创建。它已经是一个在使用中的对象了
request.getRequestDispatcher("Login.jsp").forward(request,response);
//重定向 和转发有什么区别？（没有消息包，且JSP会切回Login.Jsp（转发不会，还是会停留在Register.jsp文件里））【直接访问Login.jsp】一般是上一个文件遇到无法处理的事件后，直接跳转到Login，是新的Request对象。类似于重新上了这次网页（重启）。
response.sendRedirect("Login.jsp");
```

什么时候使用重定向？没有消息包需要传输和需要更新Request的时候使用。应用场景：用户直接转向其他场景，不需要以前遗留的Request包。

#### IDEA（Java）使用技巧

sout 快速打出System.out.println（）

serr 快速打出System.err.println（）

#### 注意事项

更新类的话要重启服务器。

XML是区分大小写的。

Response输出的内容都会显示在最前端（源代码中）

Java的输出语句模块也可以插入HTML代码，来改变字体样式。相当于富文本，并不是Java代码支持这个功能。

反之也一样，HTML语句里也可以插入Java代码，只要记得使用<%%>标识就好。

Request生命周期只有一次请求，当年请求第二次的时候，前一个Request就会被销毁掉，每次请求都是新的Request；

有的时候中文无法正常显示要转译一下。

请在跳转网页的代码之前把所有该网页的所有代码事件处理完毕。

同一个Jsp文件里面代码都是在同一个方法下的，并不会因为你用多个<%%>区分了多个代码块，而分为多个方法，举个例子，一个Jsp文件内，不能用同一个名称命名一个变量。



#### 学习资料

http://www.sikiedu.com/my/course/214 课程地址

[XML系列教程 (w3school.com.cn)](https://www.w3school.com.cn/x.asp) 语法知识

[如何使用 IntelliJ IDEA（2020.2）构建一个JavaWeb项目_LK_Lawliet的博客-CSDN博客](https://blog.csdn.net/LK_Lawliet/article/details/108797483)



