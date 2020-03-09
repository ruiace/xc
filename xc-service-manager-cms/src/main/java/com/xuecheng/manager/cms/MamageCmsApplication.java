package com.xuecheng.manager.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author rp
 * @create 2020/3/5
 */
@SpringBootApplication
//扫描实体类
@EntityScan("com.xuecheng.framework.domain.cms")
//扫描接口
@ComponentScan("com.xuecheng.api")
@ComponentScan("com.xuecheng.manager.cms.web.controller")
public class MamageCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MamageCmsApplication.class,args);
    }
}