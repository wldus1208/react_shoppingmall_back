package kr.happyjob.study.service.order;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.model.cart.CartVO;
import kr.happyjob.study.model.order.OrderVO;
import kr.happyjob.study.repository.order.OrderDAO;

@Service
public class OrderService {

	@Autowired
	private OrderDAO orderDAO;
	
	public int orderInsert(Map<String, Object> paramMap) throws Exception {

		return orderDAO.orderInsert(paramMap);
	}
	
	public List<CartVO> orderSelect(Map<String, Object> paramMap){
		
        return orderDAO.orderSelect(paramMap);
    }
	
	public int orderUpdate(Map<String, Object> paramMap) throws Exception {

		return orderDAO.orderUpdate(paramMap);
	}
	
	public int orderDelete(Map<String, Object> paramMap) throws Exception {

		return orderDAO.orderDelete(paramMap);
	}
	
public List<OrderVO> orderList(Map<String, Object> paramMap){
		
        return orderDAO.orderList(paramMap);
    }

}
