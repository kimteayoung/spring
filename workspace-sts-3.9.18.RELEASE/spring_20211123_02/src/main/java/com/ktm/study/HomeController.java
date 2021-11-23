package com.ktm.study;

import java.text.DateFormat;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		System.out.println("index 메서드 호출되었습니다");
		return "index";
	}
	@RequestMapping(value="/loginpage", method = RequestMethod.GET)
	public String loginpage() {
		System.out.println("login 메서드 호출되었습니다");
		// input.jsp 출력
		return "login";
	
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String inputParam(Model model,@RequestParam("id") String id,
			                  @RequestParam("password") String password) {
		System.out.println("inputParam 메서드");
		System.out.println("id: "+id+"password"+password);
		
		// id를 model에 담아서 welcome.jsp로 가져가기
		model.addAttribute("idValue", id);
		// password를 pwValue에 담고 welcome.jsp에서 출력
		model.addAttribute("passwordValue", password);
		
		// val 변수를 hello에 담고 welcome.jsp에서 출력
		String val = "이제 곧 끝나요";
		model.addAttribute("hello", val);
		
		return "welcome";
}
}





