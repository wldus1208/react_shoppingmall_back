package kr.happyjob.study.controller.cart;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import kr.happyjob.study.model.cart.CartVO;
import kr.happyjob.study.service.cart.CartService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/cart/")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@RequestMapping("save")
	@ResponseBody
	public Map<String, Object> cartSave(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
	    
	    String action = (String)paramMap.get("action");
	    String resultMsg = "";
	    
	    // 사용자 정보 설정
	    paramMap.put("loginId", session.getAttribute("loginId"));

	    if ("I".equals(action)) {
	        // 신규 저장
	    	System.out.println(paramMap);

			try {
				cartService.cartInsert(paramMap);
				resultMsg = "SUCCESS";
			} catch (Exception e) {
				e.printStackTrace();
				resultMsg = "FAILE";
			}	
	    } else if("U".equals(action)) {
	    	try {
//				cartService.cartInsert(paramMap);
				resultMsg = "SUCCESS";
			} catch (Exception e) {
				e.printStackTrace();
				resultMsg = "FAILE";
			}	
	    } else {
	        resultMsg = "FALSE";
	    }
	    
	    //결과 값 전송
	    Map<String, Object> resultMap = new HashMap<String, Object>();
	    resultMap.put("resultMsg", resultMsg);
	    
	    return resultMap;
	}
	
	@RequestMapping("list")
	@ResponseBody
	public Map<String, Object> cartSelect(Model model, @RequestParam Map<String, Object> paramMap, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<CartVO> list = cartService.cartSelect(paramMap);		
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("cart", list); // success 용어 담기 
	    
	    return resultMap;
	}	

}
