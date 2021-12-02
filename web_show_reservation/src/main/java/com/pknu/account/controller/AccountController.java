package com.pknu.account.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pknu.account.service.AccountService;
import com.pknu.account.vo.AccountVo;

@Controller
public class AccountController {
	
	@Autowired
	private AccountService accountService;

	
	/***********************************************************************************************
	 * 로그인 페이지 접근
	 ***********************************************************************************************/
	@RequestMapping(value="/login")
	public String loginPage(HttpSession session) {
		// 로그인 되어있는 경우
		if (session.getAttribute("user") != null) {
			return "redirect:/";
		}
		// 로그인 되어있지 않은 경우
		else {
			return "/login";
		}
	}
	
	/***********************************************************************************************
	 * 로그인
	 ***********************************************************************************************/
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView login(HttpSession session, @RequestParam HashMap<String, Object> map) {
		AccountVo accountVo = accountService.login(map);
		
		ModelAndView mv = new ModelAndView();
		
		// 세션에 사용자 데이터가 존재할 경우 데이터 삭제
		if (session.getAttribute("user") != null) {
			session.removeAttribute("user");
		}
		
		// 일치하는 데이터가 존재할 경우 세션에 데이터 추가
		if (accountVo != null) {
			session.setAttribute("user", accountVo);
			
			mv.addObject("user", session.getAttribute("user"));
			mv.setViewName("redirect:/");
		}
		// 일치하는 데이터가 존재하지 않을 경우 로그인 페이지로 이동
		else {
			mv.setViewName("redirect:/login");
		}
		
		return mv;
	}
	
	/***********************************************************************************************
	 * 로그아웃
	 ***********************************************************************************************/
	@RequestMapping(value="/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		session.invalidate();
		
		return "redirect:/";
	}
	
	/***********************************************************************************************
	 * 회원가입 페이지 접근
	 ***********************************************************************************************/
	@RequestMapping(value="/join")
	public String joinPage(HttpSession session) {
		// 로그인 되어있는 경우
		if (session.getAttribute("user") != null) {
			return "redirect:/";
		}
		// 로그인 되어있지 않은 경우
		else {
			return "/join";
		}
	}
	
	/***********************************************************************************************
	 * 회원가입
	 ***********************************************************************************************/
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(@RequestParam HashMap<String, Object> map) {
		String user_birth_month = "";
		String user_birth_day = "";
		
		// user_birth_month 처리
		if(Integer.parseInt((String) map.get("USER_BIRTH_MONTH")) < 10) {
			user_birth_month = "0" +map.get("USER_BIRTH_MONTH");
		}
		else {
			user_birth_month = (String) map.get("USER_BIRTH_MONTH");
		}
		
		// user_birth_day 처리
		if(Integer.parseInt((String) map.get("USER_BIRTH_DAY")) < 10) {
			user_birth_day = "0" +map.get("USER_BIRTH_DAY");
		}
		else {
			user_birth_day = (String) map.get("USER_BIRTH_DAY");
		}
		
		String user_birth = map.get("USER_BIRTH_YEAR") + "-" +user_birth_month + "-" + user_birth_day;
		
		map.put("USER_BIRTH", user_birth);
		
		accountService.join(map);
		
		return "redirect:/login";
	}
	
	/***********************************************************************************************
	 * 아이디 중복 확인 (ajax)
	 ***********************************************************************************************/
	@RequestMapping(value="/checkID")
	@ResponseBody
	public AccountVo checkID(@RequestParam HashMap<String, Object> map) {
		return accountService.checkID(map);
	}
	
}
