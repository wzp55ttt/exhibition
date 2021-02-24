package com.keda.system.kedaexhibition;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author peng
 */
@SpringBootApplication
@MapperScan("com.keda.system.kedaexhibition.mapper")
public class KedaExhibitionApplication {

    public static void main(String[] args) {
        SpringApplication.run(KedaExhibitionApplication.class, args);
    }

}
