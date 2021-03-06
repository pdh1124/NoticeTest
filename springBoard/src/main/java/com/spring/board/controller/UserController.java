package com.spring.board.controller;

import java.util.HashMap;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
		
		System.out.println("callbackMsg :" + callbackMsg);

		return callbackMsg;
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
	 
	 @RequestMapping(value="/user/userLogin.do", method = RequestMethod.GET)
	 public String userLogin(Locale locale, Model model) throws Exception {
			
		 return "user/userLogin";
	 }
	 
	 @RequestMapping(value="/user/userIdFind.do", method = RequestMethod.POST)
	 @ResponseBody
	 public int idFind(UserVo userVo) throws Exception {

			int result = userService.idFind(userVo);
			
			return result;
	 }
	 
	 @RequestMapping(value="/user/userPwFind.do", method = RequestMethod.POST)
	 @ResponseBody
	 public int pwFind(UserVo userVo) throws Exception {
	
			int result = userService.pwFind(userVo);
			
			return result;
	 }
	 
	 
	@RequestMapping(value="/user/userLoginAction.do", method = RequestMethod.POST)
	@ResponseBody
	public void userLoginAction(@RequestParam("userId") String userId,
			@RequestParam("userPw") String userPw,
			HttpServletResponse response,
			Model model) throws Exception {
		
		 UserVo userVo = new UserVo();
		 
		 userVo.setUserId(userId);
		 userVo.setUserPw(userPw);
		 
		 System.out.println("id : " + userId + ", pw :" + userPw);
		 
		 UserVo loginUser = userService.login(userVo);
		 
		 System.out.println("loginUser : " + loginUser);
		 
		 if(loginUser != null) {
			 if(userVo.getUserPw().equals(loginUser.getUserPw())) {
				 //System.out.println("???????????? ??????");
				 model.addAttribute("loginUser", loginUser);
				 response.getWriter().print(true);
			 }
			 else {
				 //System.out.println("???????????? ?????????");
				 response.getWriter().print(false);
			 }
		 }
	}
	 
	 
	@RequestMapping(value="/user/loginAction.do", method = RequestMethod.POST)
	public String loginAction(HttpServletRequest request, UserVo userVo, RedirectAttributes rttr) throws Exception {
		
		HttpSession session = request.getSession();
		UserVo userValue = userService.userLogin(userVo);
		
		if(userValue == null) {
			int result = 0;
			rttr.addFlashAttribute("result", result);
			return "/user/userLogin.do";
		}
		
		session.setAttribute("userVo", userValue);
		
		return "/board/boardList.do";
	}
}
