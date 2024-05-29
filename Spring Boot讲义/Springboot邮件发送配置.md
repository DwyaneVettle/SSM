# Springboot邮件发送配置

pom.xml依赖：

```xml
<dependency>
      <groupId>org.eclipse.angus</groupId>
      <artifactId>jakarta.mail</artifactId>
      <version>2.0.3</version>
</dependency>
<dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

yml:

```yml
email:
  user: 发送邮箱地址
  code: 邮箱授权码（QQ、网易邮箱等的授权码可百度获取）
  host: smtp.126.com或smtp.qq.com，不同邮箱配置不同
  auth: true
```



pojo/EmailProperties.java:

```java
package com.ztr.springmail.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "email")
public class EmailProperties {

    //发件人邮箱
    public String user ;

    //发件人邮箱授权码
    public String code ;

    //发件人邮箱对应的服务器域名,如果是163邮箱:smtp.163.com   qq邮箱: smtp.qq.com
    public String host ;

    //身份验证开关
    private boolean auth ;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public boolean isAuth() {
        return auth;
    }

    public void setAuth(boolean auth) {
        this.auth = auth;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "EmailProperties{" +
                "host='" + host + '\'' +
                ", auth=" + auth +
                ", user='" + user + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
```

utils/MailUtil.java:

```java
package com.ztr.springmail.utils;

import com.ztr.springmail.pojo.EmailProperties;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class MailUtil {

    /**
     * 发送邮件
     * @param emailProperties 发件人信息(发件人邮箱,发件人授权码)及邮件服务器信息(邮件服务器域名,身份验证开关)
     * @param to 收件人邮箱
     * @param title 邮件标题
     * @param content 邮件正文
     * @return
     */
    public static boolean sendMail(EmailProperties emailProperties, String to, String title, String content){
        MimeMessage message = null;
        try {
            Properties properties = new Properties();
            properties.put("mail.smtp.host", emailProperties.getHost());
            properties.put("mail.smtp.auth",emailProperties.isAuth());
            properties.put("mail.user", emailProperties.getUser());
            properties.put("mail.password", emailProperties.getCode());

            // 构建授权信息，用于进行SMTP进行身份验证
            Authenticator authenticator = new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(emailProperties.getUser(), emailProperties.getCode());
                }
            };
            // 使用环境属性和授权信息，创建邮件会话
            Session mailSession = Session.getInstance(properties, authenticator);
            // 创建邮件消息
            message = new MimeMessage(mailSession);

        }catch (Exception e){
            e.printStackTrace();
        }

        //如果邮件创建失败,直接返回
        if (message==null){
            return false;
        }

        try {
            // 设置发件人
            InternetAddress form = new InternetAddress(emailProperties.getUser());
            message.setFrom(form);

            // 设置收件人
            InternetAddress toAddress = new InternetAddress(to);
            message.setRecipient(Message.RecipientType.TO, toAddress);

            // 设置邮件标题
            message.setSubject(title);

            // 设置邮件的内容体
            message.setContent(content, "text/html;charset=UTF-8");
            // 发送邮件
            Transport.send(message);
        }catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }
}
```

service/EmailService.java:

```java
package com.ztr.springmail.service;

public interface EmailService {

    boolean send(String to,String title,String content);

}

```

service/EmailServiceImpl.java:

```java
package com.ztr.springmail.service.impl;


import com.ztr.springmail.pojo.EmailProperties;
import com.ztr.springmail.service.EmailService;
import com.ztr.springmail.utils.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl  implements EmailService {
    //注入email配置信息实体类
    @Autowired
    private EmailProperties emailProperties;

    /**
     * @param to 收件人邮箱
     * @param title 邮件标题
     * @param content 邮件正文
     * @return
     */
    @Override
    public boolean send(String to, String title, String content) {
        //打印email配置信息
        System.out.println(emailProperties);
        //发送邮件
        boolean flag = MailUtil.sendMail(emailProperties,to, title, content);
        return flag;
    }
}

```

controller/EmailController.java:

```java
package com.ztr.springmail.controller;

import com.ztr.springmail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    //注入email配置信息实体类
    @Autowired
    private EmailService emailService;

    //测试方法
    @RequestMapping("/send")
    public Boolean send(){
        //收件人信箱
        String to = "Michealzou@126.com";
        //邮件标题
        String title = "测试邮件";
        //邮件正文
        String content  = "邮件发送成功。。。";
        //发送邮件
        boolean flag = emailService.send(to,title,content);
        return flag;
    }

}

```

启程程序，发送请求：localhost:8080/send

![image-20240529114554694](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202405291146238.png)

查看邮箱，收到测试邮件。

![image-20240529143125933](https://gitee.com/zou_tangrui/note-pic/raw/master/img/202405291431756.png)