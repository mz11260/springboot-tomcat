### 使用外部Tomcat部署springboot WEB项目

####1、必须将pom的packaging属性改成war
```xml
<packaging>war</packaging>
```
####2、将嵌入式的Tomcat依赖的scope改为provided
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-tomcat</artifactId>
    <scope>provided</scope>
</dependency>
```
####3、写一个Servlet容器类，继承**SpringBootServletInitializer**，实现**configure**方法，并调用**source**方法，在方法中传入SpringBoot应用主配置类
```java
package com.example;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootTomcatApplication.class);
    }

}

```

