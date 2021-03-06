package com.bitcamp.open.member.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.bitcamp.open.member.dao.MemberMyBatisDao;
import com.bitcamp.open.member.model.Member;

public class MemberUpdateService {

	@Autowired
	private MemberMyBatisDao dao;

	@Autowired
	MultipartService service;
	
	public int memberUpdate(Member member, HttpServletRequest request) throws IllegalStateException, IOException {

		
		service.multipart(member, request);

		System.out.println("실행전 : " + member.getIdx());

		// 업로드한 파일의 데이터를 Member에 등록

		// dao 요청 : 데이터 저장 요청
		int resultCnt = dao.updateMember(member);

		System.out.println("실행후 : " + member.getIdx());

		return resultCnt;
	}

}
