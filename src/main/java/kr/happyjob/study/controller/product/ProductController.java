package kr.happyjob.study.controller.product;

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

import kr.happyjob.study.model.product.ProductVO;
import kr.happyjob.study.service.product.ProductService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/product/")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("list")
	@ResponseBody
	public Map<String, Object> productSelect(Model model, @RequestParam Map<String, Object> paramMap, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<ProductVO> list = productService.productSelect(paramMap);		
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("product", list); // success 용어 담기 
	    
	    return resultMap;
	}	
	
	@PostMapping("detail")
	@ResponseBody
	public Map<String,Object> productDetail(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("paramMap" + paramMap);
		String result="";
		
		// 선택된 게시판 1건 조회 
		ProductVO productDetail = productService.productDetail(paramMap);
		
		if(productDetail != null) {
			result = "SUCCESS";  // 성공시 찍습니다. 
		}else {
			result = "FAIL";  // null이면 실패입니다.
		}
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("resultMsg", result); // success 용어 담기 
		resultMap.put("result", productDetail); // 리턴 값 해쉬에 담기 
		System.out.println("productDetail" + productDetail);
	    
	    return resultMap;
	}

}
