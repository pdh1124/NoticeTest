package com.spring.board.service;

import com.spring.board.vo.UserVo;

public interface userService {

	public int userJoin(UserVo userVo) throws Exception;
	
	public int idCheck(UserVo userVo) throws Exception;
	
	public int phoneCheck(UserVo userVo) throws Exception;
	
	public int idFind(UserVo userVo) throws Exception;
	
	public int pwFind(UserVo userVo) throws Exception;
	
	public UserVo login(UserVo userVo) throws Exception;
	
	public UserVo userLogin(UserVo userVo) throws Exception;
	
}
