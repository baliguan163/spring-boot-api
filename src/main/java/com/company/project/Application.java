package com.company.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
public class Application{
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

// spring boot 部署到tomcat
//网上很多文章描述过，当我按步骤做时会抛各种错误，最后记录下我的做法(成功发布到本地 Tomcat9 ):
//1.将项目的启动类Application.java继承SpringBootServletInitializer并重写configure方法
//2.在pom.xml文件中，project下面增加package标签
//@SpringBootApplication
//public class Application extends SpringBootServletInitializer{
//
//    private static final Logger logger = LoggerFactory.getLogger(Application.class);
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(Application.class);
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
//    }
//}

