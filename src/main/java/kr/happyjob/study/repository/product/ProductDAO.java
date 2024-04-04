package kr.happyjob.study.repository.product;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.happyjob.study.model.product.ProductVO;

@Mapper
public interface ProductDAO {
	public List<ProductVO> productSelect(Map<String, Object> paramMap);
	
	public ProductVO productDetail(Map<String, Object> paramMap);

}
