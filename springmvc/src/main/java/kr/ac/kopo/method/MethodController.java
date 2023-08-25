package kr.ac.kopo.method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/method/method")
@Controller
public class MethodController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String get() {
		return "method/methodForm";
	}
	@RequestMapping(method = RequestMethod.POST)
	public String post() {
		System.out.println("post 요청 시작");
		return "method/methodProcess";
	}
}
