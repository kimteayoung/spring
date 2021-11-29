package com.icia.member.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icia.member.dto.MemberDTO;
import com.icia.member.repository.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository mr;
	
	@Autowired
	private HttpSession session;

	public int save(MemberDTO member) {
		int result = mr.save(member);
		return result;
	}

	public String login(MemberDTO member) {
		MemberDTO loginMember = mr.login(member);
		if(loginMember !=null) {
			// 로그인 성공(로그인 정보를 세션에 저장)
			session.setAttribute("loginId",member.getM_id());
			session.setAttribute("loginNumber",loginMember.getM_number());
			return "main";
		}else {
			// 로그인 실패
			return "login";
		}
		
	}

	public List<MemberDTO> findAll() {
			List<MemberDTO> mList = mr.findAll();
		
		return mList;
	}

}
