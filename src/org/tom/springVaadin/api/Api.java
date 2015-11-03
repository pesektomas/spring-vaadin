package org.tom.springVaadin.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class Api {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test(){
		return "TEST API";
	}

}
