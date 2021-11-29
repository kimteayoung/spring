package com.icia.member.repository;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.member.dto.MemberDTO;

@Repository
public class MemberRepository {

	@Autowired
	private SqlSessionTemplate sql;
	
	public int save(MemberDTO member) {
		System.out.println("MemberRepository.save(): "+ member);
		return sql.insert("Member.save",member);
	}

	public MemberDTO login(MemberDTO member) {
		
		return sql.selectOne("Member.login", member);
	}

	public List<MemberDTO> findAll() {	
		
		return sql.selectList("Member.findAll");
	}

}
