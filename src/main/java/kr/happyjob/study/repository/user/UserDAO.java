package kr.happyjob.study.repository.user;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.happyjob.study.model.user.UserVO;

@Mapper
public interface UserDAO {

	// 회원가입
	public int registerGo(Map<String, Object> paramMap);

	// 로그인 xxxaaaa
	public UserVO loginGo(Map<String, Object> paramMap);
	
	public UserVO info(Map<String, Object> paramMap);

}
