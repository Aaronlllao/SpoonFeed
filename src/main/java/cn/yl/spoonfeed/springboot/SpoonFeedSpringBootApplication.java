package cn.yl.spoonfeed.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.yl.spoonfeed.springboot.dao")
public class SpoonFeedSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpoonFeedSpringBootApplication.class, args);
    }

}
