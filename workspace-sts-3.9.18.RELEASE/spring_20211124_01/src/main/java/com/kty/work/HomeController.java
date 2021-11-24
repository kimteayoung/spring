package com.kty.work;

import java.text.DateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {	
		return "index";
	}
	@RequestMapping(value = "joinpage", method = RequestMethod.GET)
	public String joinpage() {	
		return "join";
	}
	@RequestMapping(value="/memberjoin", method=RequestMethod.POST)
	public String memberjoin(Model model,@RequestParam("id") String id,
			                  @RequestParam("password") String password,	
			                  @RequestParam("name") String name,
			                  @RequestParam("gender") String gender,
			                  @RequestParam("email") String email) {
		System.out.println("id: " + id);
		System.out.println("password: " + password);
		System.out.println("name: " + name);
		System.out.println("gender: " + gender);
		System.out.println("email: " + email);
		
		MemberDTO member = new MemberDTO();
		member.setId(id);
		member.setPassword(password);
		member.setName(name);
		member.setGender(gender);
		member.setEmail(email);
		
		System.out.println(member);
		
		return "login";
	}
	@RequestMapping(value = "memberjoin2", method = RequestMethod.POST)
	public String memberjoin2(@ModelAttribute MemberDTO member) {	
		System.out.println("memberjoin2: "+ member);
		return "login";
	}
}


