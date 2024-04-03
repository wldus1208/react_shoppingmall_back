package kr.happyjob.study.service.product;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.model.product.ProductVO;
import kr.happyjob.study.repository.product.ProductDAO;

@Service
public class ProductService {

	@Autowired
	private ProductDAO productDAO;

	public ProductVO productSelect(Map<String, Object> paramMap) {
		return productDAO.productSelect(paramMap);
	}

}
