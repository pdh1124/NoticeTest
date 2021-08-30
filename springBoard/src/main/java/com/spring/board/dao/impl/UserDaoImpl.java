package com.spring.board.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.board.dao.UserDao;
import com.spring.board.vo.UserVo;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int userJoin(UserVo userVo) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert("user.userJoin", userVo);
	}

	@Override
	public int idCheck(UserVo userVo) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("user.idCheck", userVo);
	}

	@Override
	public int phoneCheck(UserVo userVo) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("user.phoneCheck", userVo);
	}

}