package kr.happyjob.study.service.user;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.model.user.UserVO;
import kr.happyjob.study.repository.user.UserDAO;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;

	// 회원가입
	public int registerGo(Map<String, Object> paramMap) throws Exception {
		System.out.println(paramMap);
		System.out.println(paramMap);
		return userDAO.registerGo(paramMap);
	}

	// 로그인
	public UserVO loginGo(Map<String, Object> paramMap) {
		return userDAO.loginGo(paramMap);
	}
	
	public UserVO info(Map<String, Object> paramMap) throws Exception {

		return userDAO.info(paramMap);
	}

}
