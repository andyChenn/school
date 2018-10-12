package org.scregister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/demo")
@Api(value="测试接口",description="这个接口是为了测试")
public class Demo {

	@Autowired
	private ApplicationContext ctx;
	
	@GetMapping("/prop")
	@ApiOperation(value = "一个简单的接口", notes = "测试springboot和swagger-ui结合")
	@ResponseBody
	public String getDevEnvValue() {
		return "dev-access!!";
	}
	
}
