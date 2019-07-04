package com.xbsoft.ztree;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @ClassName: ZtreeApplication
 * @Description: TODO
 * @author Jamin
 * @date 2019年7月3日 下午2:12:08
 * 
 */
@MapperScan("com.xbsoft.ztree.dao")
@SpringBootApplication

public class ZtreeApplication {
  public static void main(String[] args) {
    SpringApplication.run(ZtreeApplication.class, args);
  }
}
