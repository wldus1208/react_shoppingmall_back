package kr.happyjob.study.controller.product;

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

import kr.happyjob.study.model.product.ProductVO;
import kr.happyjob.study.service.product.ProductService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@PostMapping("/listall.do")
	@ResponseBody
	public Map<String, Object> productSelect(Model model, @RequestParam Map<String, Object> paramMap,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		Map<String, Object> resMap = new HashMap<String, Object>();
		
		try {
			ProductVO productVO = productService.productSelect(paramMap);
			
			if(productVO != null) {
				
				resMap.put("detailId", productVO.getDetailId());
				resMap.put("categoryId", productVO.getCategoryId());
				resMap.put("productId", productVO.getProductId());
				resMap.put("brand", productVO.getBrand());
				resMap.put("detailName", productVO.getDetailName());
				resMap.put("price", productVO.getPrice());
				resMap.put("discountPer", productVO.getDiscountPer());
				resMap.put("img", productVO.getImg());
				resMap.put("count", productVO.getCount());
				resMap.put("result", "SUCCESS");
			} else {
				resMap.put("result", "FAIL");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(resMap);
		return resMap;
	}

}
