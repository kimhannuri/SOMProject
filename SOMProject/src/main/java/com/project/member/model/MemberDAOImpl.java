package com.project.member.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {
	//마이바티스를 통한 데이터베이스 연결을 위한 sqlSession을 주입
	private SqlSessionTemplate sqlSession;
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public MemberVO getMember(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberVO> getMemberList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertMember(MemberVO vo) {
		// TODO Auto-generated method stub
		sqlSession.update("com.project.member.insertMember", vo);
	}

	@Override
	public void updateMember(MemberVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteMember(String id, String pass) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getMemberPass(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
