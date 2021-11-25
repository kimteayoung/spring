package com.kty.ex.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.kty.ex.dto.TraineeDTO;
import com.kty.ex.repository.TraineeRipository;

@Service
public class TraineeService {
	
	@Autowired
	private TraineeRipository ts;

	public void insert(TraineeDTO trainee) {
		
		System.out.println("TraineeService.insert() 메서드 호출");
		System.out.println("객체값: "+ trainee);
		
		// insert 메서드 호출 후 리턴값을 받아와서 리턴값을 출력해보자.
		int result = ts.insert(trainee);
		System.out.println(result);
		
	}

	public List<TraineeDTO> findAll() {
		List<TraineeDTO> tList = ts.findAll();
		
		// tList를 출력하는 sysout
		for(TraineeDTO t: tList) {
			System.out.println(t);
		}
		
		return tList;
	}
	/*
	 * 리턴타입:
	 * 매개변수:
	 * 리턴값:
	 */

	public TraineeDTO findById(long t_number) {
		TraineeDTO trainee = ts.findById(t_number);
		System.out.println("TraineeService.findById(): "+ trainee);
		return trainee;
	}

}



















