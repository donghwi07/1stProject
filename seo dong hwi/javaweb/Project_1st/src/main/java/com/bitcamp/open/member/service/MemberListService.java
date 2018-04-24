package com.bitcamp.open.member.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.bitcamp.open.member.dao.MemberMyBatisDao;
import com.bitcamp.open.member.model.Member;

public class MemberListService {
	
	@Autowired
	private MemberMyBatisDao dao;
	
	public List<Member> getMemberList(){
		
				
		
		List<Member> list = dao.selectMembers();
		
		return list;		
		
	}

	public Member listView(String id) {
		
		Member member = dao.selectById(id);
		System.out.println("상세보기 : " + member.toString());
		
		return member;
	}
}