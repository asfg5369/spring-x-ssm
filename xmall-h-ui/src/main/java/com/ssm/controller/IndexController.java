package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author:姜亮;Date:2018/7/19
 */
@Controller
public class IndexController {
	@RequestMapping("/welcome")
	public String welcome(){
		return  "welcome";
	}
}
