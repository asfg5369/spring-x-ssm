package com.ssm.API;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * author:姜亮;Date:2018/7/18
 */
//@Configuration//spring提供的配置标签
@EnableWebMvc
@EnableSwagger2//开启swagger2
public class Swagger2 {
	@Bean
	public Docket buildDocket(){
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select().apis(RequestHandlerSelectors.basePackage("com.ssm.controller"))
				.paths(PathSelectors.any())
				.build();
	}
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("xmall项目接口文档")
				.description("xmall项目接口测试")
				.version("2.0.1")
				.termsOfServiceUrl("")
				.license("")
				.licenseUrl("")
				.build();
	}
}
