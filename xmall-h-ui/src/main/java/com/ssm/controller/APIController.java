package com.ssm.controller;

import com.ssm.utils.XmallResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author:姜亮;Date:2018/7/18
 */
@Controller
@RequestMapping(value="/api")
@Api(value = "restful", description = "开发文档")
public class APIController {
	/**
	 * 开发文档
	 * @return
	 */
	@ApiOperation(value = "swagger开发文档", notes = "swagger开发文档notes",httpMethod = "GET")
	@RequestMapping(value="/swagger",method=RequestMethod.GET)
	@ResponseBody
	public XmallResult ok(){
		return XmallResult.ok("swagger开发文档 OK!");
	}
	/**
	 * post
	 * @return
	 */
	@ApiOperation(value = "post开发文档",httpMethod = "POST")
	@RequestMapping(value="/swagger",method=RequestMethod.POST)
	@ResponseBody
	public XmallResult post(){
		return XmallResult.build(200,"POST文档");
	}
}
