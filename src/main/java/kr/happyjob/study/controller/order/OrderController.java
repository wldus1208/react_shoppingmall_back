package kr.happyjob.study.controller.order;

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
import kr.happyjob.study.service.order.OrderService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/order/")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	// 등록 
	@RequestMapping("insert")
	@ResponseBody
	public Map<String, Object> orderInsert(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
	    
	    String resultMsg = "";
	    
	    // 사용자 정보 설정
	    paramMap.put("loginId", session.getAttribute("loginId"));
	    
	    try {
			orderService.orderInsert(paramMap);
            resultMsg = "SUCCESS";
        } catch (Exception e) {
        	resultMsg = "FAILED";
        } 	
	    
	    //결과 값 전송
	    Map<String, Object> resultMap = new HashMap<String, Object>();
	    resultMap.put("resultMsg", resultMsg);
	    
	    return resultMap;
	}
	
	// 조회 
	@RequestMapping("list")
	@ResponseBody
	public Map<String, Object> orderSelect(Model model, @RequestParam Map<String, Object> paramMap, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println(paramMap);
		
		String detailIdStr = (String) paramMap.get("detailId");
		String[] detailIdArray = detailIdStr.split(",");
		paramMap.put("detailIdArray", detailIdArray);
		System.out.println(detailIdArray);
		
		List<CartVO> list = orderService.orderSelect(paramMap);	
		System.out.println(list);
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("order", list); // success 용어 담기 
	    
	    return resultMap;
	}	
	
	// 수정
	@RequestMapping("update")
	@ResponseBody
	public Map<String, Object> orderUpdate(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
	    	    
	    String resultMsg = "";
	    
	    // 사용자 정보 설정
	    paramMap.put("loginId", session.getAttribute("loginId"));
	    
	    try {
	    	orderService.orderUpdate(paramMap);

	    	resultMsg = "UPDATED";
	    	System.out.println(paramMap);
		} catch (Exception e) {
			e.printStackTrace();
			resultMsg = "FAIL";
		}	
	    
	    //결과 값 전송
	    Map<String, Object> resultMap = new HashMap<String, Object>();
	    resultMap.put("resultMsg", resultMsg);
	    
	    return resultMap;
	}
	
	// 삭제
	@RequestMapping("delete")
	@ResponseBody
	public Map<String, Object> cartDelete(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws Exception {
		
		System.out.println(paramMap);

		String result = "SUCCESS";
		String resultMsg = "삭제 되었습니다.";
		
		String orderIdStr = (String) paramMap.get("orderId");
		String[] orderIdArray = orderIdStr.split(",");
		paramMap.put("orderIdArray", orderIdArray);
		
		orderService.orderDelete(paramMap);
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", result);
		resultMap.put("resultMsg", resultMsg);
		
		return resultMap;
	}
	

}
