package kr.ac.kopo.response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.kopo.form.MemberVO;

@RestController
public class ResponseBodyController {
	@RequestMapping("/stringresponse")
	@ResponseBody
	public String response() {
		return "성공";
	}
	
	@RequestMapping("/voresponse")
//	@ResponseBody
	public MemberVO response2() {
		MemberVO vo = new MemberVO();
		vo.setId("박준하");
		vo.setPasswd("밝궶킼믻슈혝");
		return vo;
	}
	
	@RequestMapping("/mapresponse")
//	@ResponseBody
	public Map<String, String> response3() {
		Map<String, String> result = new HashMap<>();
		MemberVO vo = new MemberVO();
		vo.setId("박준하");
		vo.setPasswd("밝궶킼믻슈혝");
		result.put("id", vo.getId());
		result.put("passwd", vo.getPasswd());
		return result;
	}
}
