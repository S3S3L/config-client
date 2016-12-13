/** 
 * Project Name:config-client 
 * File Name:Application.java 
 * Package Name:com.s3s3l.springcloud.app 
 * Date:Dec 13, 20164:35:37 PM 
 * Copyright (c) 2016, kehw.zwei@gmail.com All Rights Reserved. 
 * 
*/

package com.s3s3l.springcloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>
 * </p>
 * ClassName:Application <br>
 * Date: Dec 13, 2016 4:35:37 PM <br>
 * 
 * @author kehw_zwei
 * @version 1.0.0
 * @since JDK 1.8
 */
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("com.s3s3l")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
