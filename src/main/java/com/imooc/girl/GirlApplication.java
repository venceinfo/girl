package com.imooc.girl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 另一种启动方式 : project dir, execute: mvn spring-boot:run
 * 第三种启动方式： mvn install编译出.jar,然后执行jar -jar xx.jar
 *         可以添加参数： --spring.profiles.active=dev
 */
@SpringBootApplication
public class GirlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GirlApplication.class, args);
	}
}
