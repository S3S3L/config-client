/** 
 * Project Name:config-client 
 * File Name:ConfigController.java 
 * Package Name:com.s3s3l.springcloud.controller 
 * Date:Dec 13, 20164:37:38 PM 
 * Copyright (c) 2016, kehw.zwei@gmail.com All Rights Reserved. 
 * 
*/

package com.s3s3l.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * </p>
 * ClassName:ConfigController <br>
 * Date: Dec 13, 2016 4:37:38 PM <br>
 * 
 * @author kehw_zwei
 * @version 1.0.0
 * @since JDK 1.8
 */
@RefreshScope
@RestController
public class ConfigController {
	@Value("${message}")
	private String configName;

	@RequestMapping(path = "/getConfigName", method = { RequestMethod.GET })
	public String getConfigName() {
		return configName;
	}
}
