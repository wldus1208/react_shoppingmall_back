package kr.happyjob.study.repository.cart;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.happyjob.study.model.cart.CartVO;

@Mapper
public interface CartDAO {
	
	public int cartInsert(Map<String, Object> paramMap);
	
	public List<CartVO> cartSelect(Map<String, Object> paramMap);
	
	public int cartUpdate(Map<String, Object> paramMap);
	
	public int cartDelete(Map<String, Object> paramMap);
	
	public int isDuplicate(Map<String, Object> paramMap);

}
