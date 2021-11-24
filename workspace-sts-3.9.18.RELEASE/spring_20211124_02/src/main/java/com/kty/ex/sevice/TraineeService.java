package com.kty.ex.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kty.ex.dto.TraineeDTO;
import com.kty.ex.repository.TraineeRipository;

@Service
public class TraineeService {
	
	@Autowired
	private TraineeRipository ts;

	public void insert(TraineeDTO t) {
		
		System.out.println("TraineeService.insert() 메서드 호출");
		System.out.println("객체값: "+ t);
		
		ts.insert(t);
		
	}

}
