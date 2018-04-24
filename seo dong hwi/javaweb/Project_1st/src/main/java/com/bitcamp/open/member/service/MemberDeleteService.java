package com.bitcamp.open.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bitcamp.open.member.dao.MemberMyBatisDao;

public class MemberDeleteService {

	@Autowired
	private MemberMyBatisDao dao;
	
	public int deleteMember(String id) {
		
				
		int result = dao.deleteMember(id);
		
		return result;
	}
}
