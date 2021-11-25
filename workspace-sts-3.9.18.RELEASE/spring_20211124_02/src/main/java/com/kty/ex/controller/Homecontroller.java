package com.kty.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
			
			return "index";
		}
		@RequestMapping(value="/findAll", method=RequestMethod.GET)
		public String findAll(Model model) {
			// select * from trainee 결과를 mybatis가 List에 담아주고 그 리턴을 가져옴
			List<TraineeDTO> tList = ts.findAll();
			
			model.addAttribute("tList", tList);
			
			return "findAll"; 
		}
		@RequestMapping(value="/detail", method=RequestMethod.GET)
		public String findById(@RequestParam("t_number") long t_number, Model model) {
			System.out.println("findById: "+ t_number);
			TraineeDTO trainee = ts.findById(t_number);
			
			/*
			 * TraineeService.findById()호출
			 * TraineeRipository.findById()호출(mapper 호출시 sql.selectOne() 메서드 사용)
			 * trainee-mapper.findById 호출(mapper에서 paramterType="long"이라고 하면 됨)
			 * 
			 * 호출하고 역순으로 리턴을 가져와서 (리턴타입이 뭐가 돼야 할지 관건)
			 * 결과 출력은 detail.jsp에서 해당 객체값을 출력하면 된다.
			 * 
			 */
			model.addAttribute("trainee", trainee);
			
			return "detail";
		}
}

















