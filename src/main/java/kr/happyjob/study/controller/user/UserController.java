package kr.happyjob.study.controller.user;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import kr.happyjob.study.model.user.UserVO;
import kr.happyjob.study.service.user.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	// 회원가입 등록
	@PostMapping("/register.do")
	@ResponseBody
	public Map<String, Object> registerGo(Model model, @RequestParam Map<String, Object> paramMap,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		Map<String, Object> resMap = new HashMap<String, Object>();

		System.out.println(paramMap);

		try {
			userService.registerGo(paramMap);

			resMap.put("result", "SUCCESS");
		} catch (Exception e) {
			e.printStackTrace();
			resMap.put("result", "FAIL");
		}	

		return resMap;
	}

	// 로그인
	@PostMapping("/login.do")
	@ResponseBody
	public Map<String, Object> loginGo(Model model, @RequestParam Map<String, Object> paramMap,
			HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
		System.out.println(paramMap);

		Map<String, Object> resMap = new HashMap<String, Object>();
		
		try {
			UserVO loginVO = userService.loginGo(paramMap);
			
			if(loginVO != null) {
				
				// 세션에 로그인 정보 저장
				session.setAttribute("loginId", loginVO.getLoginid());
				session.setAttribute("name", loginVO.getName());
				session.setAttribute("email", loginVO.getEmail());
				
				resMap.put("loginId", loginVO.getLoginid());
				resMap.put("name", loginVO.getName());
				resMap.put("email", loginVO.getEmail());
				resMap.put("result", "SUCCESS");
				resMap.put("resultMsg", "로그인 성공");
			} else {
				resMap.put("result", "FAIL");
				resMap.put("resultMsg", "로그인 정보가 일치하지 않습니다.");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(resMap);
		return resMap;
	}
	
	@PostMapping("info")
	@ResponseBody
	public Map<String,Object> info(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("paramMap" + paramMap);
		String result="";
		
		// 선택된 게시판 1건 조회 
		UserVO userVO = userService.info(paramMap);
		
		if(userVO != null) {
			result = "SUCCESS";  
		}else {
			result = "FAIL"; 
		}
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("resultMsg", result); 
		resultMap.put("result", userVO); 
		System.out.println("userVO" + userVO);
	    
	    return resultMap;
	}
	
	// 로그아웃
//	@RequestMapping(value = "/logout.do")
//	public ModelAndView loginOut(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
//		
//		ModelAndView mv = new ModelAndView();
//		session.invalidate();
//		mv.setViewName("redirect:/login");
//		
//		return mv;
//	}

}
