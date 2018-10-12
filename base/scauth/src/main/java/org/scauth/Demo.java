package org.scauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@Api(value="认证服务中的测试接口")
public class Demo {

	@GetMapping(value="/demo")
	@ResponseBody
	public String demo() {
		return "demo";
	}
}
