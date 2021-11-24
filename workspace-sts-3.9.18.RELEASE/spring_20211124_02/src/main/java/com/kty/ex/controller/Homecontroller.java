package com.kty.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kty.ex.dto.TraineeDTO;
import com.kty.ex.sevice.TraineeService;


@Controller
public class Homecontroller {
	
		// 스프링이 관리하는 객체를 사용하기
		// 의존성 주입(DI, Dependency Injection
		@Autowired
		private TraineeService ts;
	
		//TraineeService ts = new TraineeService();
		
		@RequestMapping(value = "/", method = RequestMethod.GET)
		public String index() {	
			return "index";
		}
		@RequestMapping(value = "insertform", method = RequestMethod.GET)
		public String insertform() {	
			return "insert";
	    }
		
		@RequestMapping(value = "insert", method = RequestMethod.POST)
		public String insert(@ModelAttribute TraineeDTO trainee) {	
			System.out.println(trainee);
			
			ts.insert(trainee);
			
			return "success";
		}
}

















