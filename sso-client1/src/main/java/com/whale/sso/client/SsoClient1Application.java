package com.whale.sso.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

/**
 * @author ljy
 * @version V1.0
 * @Package PACKAGE_NAME
 * @Description: TODO
 * @date 2019/5/24 0024 10:53
 */

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class SsoClient1Application  {

    public static void main(String[] args) {
        SpringApplication.run(SsoClient1Application.class,args);
    }

    @GetMapping("/user")
    public Authentication user(Authentication user){
        System.out.println("user");
        return user;
    }

}
