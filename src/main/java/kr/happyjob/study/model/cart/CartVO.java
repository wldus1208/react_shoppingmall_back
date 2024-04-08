package kr.happyjob.study.model.cart;

public class CartVO {

	private int cartId;
	private String detailId;
	private String loginid;
	private int amount;
	private String brand;
	private String detailName;
	private int price;
	private int discountPer;
	private String img;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDetailName() {
		return detailName;
	}
	public void setDetailName(String detailName) {
		this.detailName = detailName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscountPer() {
		return discountPer;
	}
	public void setDiscountPer(int discountPer) {
		this.discountPer = discountPer;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public String getDetailId() {
		return detailId;
	}
	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
