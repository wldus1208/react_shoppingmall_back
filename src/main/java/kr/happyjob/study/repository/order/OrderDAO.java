package kr.happyjob.study.repository.order;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.happyjob.study.model.cart.CartVO;
import kr.happyjob.study.model.order.OrderVO;

@Mapper
public interface OrderDAO {
	
	public int orderInsert(Map<String, Object> paramMap);
	
	public List<CartVO> orderSelect(Map<String, Object> paramMap);
	
	public int orderUpdate(Map<String, Object> paramMap);
	
	public int orderDelete(Map<String, Object> paramMap);
	
	public List<OrderVO> orderList(Map<String, Object> paramMap);

}
