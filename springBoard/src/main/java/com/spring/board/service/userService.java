package com.spring.board.service;

import com.spring.board.vo.UserVo;

public interface userService {

	public int userJoin(UserVo userVo) throws Exception;
	
	public int idCheck(UserVo userVo) throws Exception;
	
}
