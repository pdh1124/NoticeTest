package com.spring.board.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.board.dao.UserDao;
import com.spring.board.service.userService;
import com.spring.board.vo.UserVo;

@Service
public class userServiceImpl implements userService {

	@Autowired
	UserDao userDao; 
	
	@Override
	public int userJoin(UserVo userVo) throws Exception {
		// TODO Auto-generated method stub
		return userDao.userJoin(userVo);
	}

	@Override
	public int idCheck(UserVo userVo) throws Exception {
		// TODO Auto-generated method stub
		int result = userDao.idCheck(userVo);
		
		return result;
	}

	@Override
	public int phoneCheck(UserVo userVo) throws Exception {
		// TODO Auto-generated method stub
		int result = userDao.phoneCheck(userVo);
		
		return result;
	}

	@Override
	public int idFind(UserVo userVo) throws Exception {
		// TODO Auto-generated method stub
		int result = userDao.idFind(userVo);
		
		return result;
	}

	@Override
	public int pwFind(UserVo userVo) throws Exception {
		// TODO Auto-generated method stub
		int result = userDao.pwFind(userVo);
		
		return result;
	}
	
	@Override
	public UserVo login(UserVo userVo) throws Exception {
		// TODO Auto-generated method stub
		return userDao.login(userVo);
	}

	@Override
	public UserVo userLogin(UserVo userVo) throws Exception {
		// TODO Auto-generated method stub
		return userDao.userLogin(userVo);
	}


}
