package com.spring.board.dao;

import com.spring.board.vo.UserVo;

public interface UserDao {

	public int userJoin(UserVo userVo) throws Exception;
	
	public int idCheck(UserVo userVo) throws Exception;
}
