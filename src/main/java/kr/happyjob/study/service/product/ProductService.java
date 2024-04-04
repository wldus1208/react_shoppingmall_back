package kr.happyjob.study.service.product;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.model.product.ProductVO;
import kr.happyjob.study.repository.product.ProductDAO;

@Service
public class ProductService {

	@Autowired
	private ProductDAO productDAO;
	
	public List<ProductVO> productSelect(Map<String, Object> paramMap){
        return productDAO.productSelect(paramMap);
    }
	
	public ProductVO productDetail(Map<String, Object> paramMap) throws Exception {

		return productDAO.productDetail(paramMap);
	}

}
