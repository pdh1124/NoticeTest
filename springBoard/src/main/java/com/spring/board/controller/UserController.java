package com.spring.board.controller;

import java.util.HashMap;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.board.HomeController;
import com.spring.board.service.userService;
import com.spring.board.vo.UserVo;
import com.spring.common.CommonUtil;

@Controller
public class UserController {
	
	@Autowired
	userService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/user/userJoin.do", method = RequestMethod.GET)
	public String userJoin(Locale locale, Model model) throws Exception {
		
		return "user/userJoin";
	}
	
	@RequestMapping(value="/user/userJoinAction.do", method = RequestMethod.POST)
	@ResponseBody
	public String userJoinAction(Locale locale, UserVo userVo) throws Exception {
		
		HashMap<String, String> result = new HashMap<String, String>();
		CommonUtil commonUtil = new CommonUtil();
		
		int resultCnt = userService.userJoin(userVo);
		System.out.println(resultCnt);
		
		result.put("success", (resultCnt > 0)?"Y":"N");
		String callbackMsg = commonUtil.getJsonCallBackString(" ", result);
		
		System.out.println("callbackMsg::" + callbackMsg);

		return callbackMsg;
		
//		userService.userJoin(userVo);
//		
//		return "board/boardList";
	}
	
	 @RequestMapping(value="/user/userIdCheak.do", method = RequestMethod.POST)
	 @ResponseBody
	 public int idCheck(UserVo userVo) throws Exception {

			int result = userService.idCheck(userVo);
			
			return result;
	 }
	 
	 
	 @RequestMapping(value="/user/userPhoneCheak.do", method = RequestMethod.POST)
	 @ResponseBody
	 public int phoneCheck(UserVo userVo) throws Exception {

			int result = userService.phoneCheck(userVo);
			
			return result;
	 }
}
