package kr.happyjob.study.service.cart;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.model.cart.CartVO;
import kr.happyjob.study.repository.cart.CartDAO;

@Service
public class CartService {

	@Autowired
	private CartDAO cartDAO;
	
	public int cartInsert(Map<String, Object> paramMap) throws Exception {

		return cartDAO.cartInsert(paramMap);
	}
	
	public List<CartVO> cartSelect(Map<String, Object> paramMap){
		
        return cartDAO.cartSelect(paramMap);
    }
	
	public boolean isDuplicate(Map<String, Object> paramMap) {
		
	    int count = cartDAO.isDuplicate(paramMap);
	    if(count > 0) {
	    	return true;
	    }
	    return false;
	}
	
	public int cartUpdate(Map<String, Object> paramMap) throws Exception {

		return cartDAO.cartUpdate(paramMap);
	}
	
	public int cartDelete(Map<String, Object> paramMap) throws Exception {

		return cartDAO.cartDelete(paramMap);
	}

}
