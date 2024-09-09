# JWT令牌生成和验证的方法

引入依赖：

```xml
<!-- https://mvnrepository.com/artifact/com.auth0/java-jwt -->
<dependency>
     <groupId>com.auth0</groupId>
     <artifactId>java-jwt</artifactId>
     <version>4.4.0</version>
</dependency>
```

添加测试方法：

```java
package com.ztr.bigevent;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;

public class JWTTest {

    // 生成token
    @Test
    public void test() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("id",1);
        map.put("username","张三");
        String token = JWT.create().withClaim("user",map)  // 添加数据载荷
                .withExpiresAt(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 2))  // 添加过期时间
                .sign(Algorithm.HMAC256("ZOUTANGRUI")); // 配置密钥

        System.out.println(token);
    }

    // 验证Token
    @Test
    public void test01() {
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7ImlkIjoxLCJ1c2VybmFtZSI6IuW8oOS4iSJ9LCJleHAiOjE3MTcwNjI3NjN9.BASjtsmZh-KPsBOPgbav4OIvFoM6aHt95WQp4t6amO8";
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("ZOUTANGRUI")).build();
        DecodedJWT verify = jwtVerifier.verify(token); // 验证token，生成解析后的jwt对象

        System.out.println(verify.getClaims().get("user"));
    }
}

```

