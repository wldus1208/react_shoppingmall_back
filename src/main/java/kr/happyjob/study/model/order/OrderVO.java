package kr.happyjob.study.model.order;

public class OrderVO {

	private int orderId;
	private int cartId;
	private String loginid;
	private String paymentDt;
	private String paymentMethod;
	private String creaditInfo;
	private int amount;
	private String status;
	private String phone;
	private String address;
	private String addDetail;
	private String zip;
	private String location;
	private int totPayment;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getPaymentDt() {
		return paymentDt;
	}
	public void setPaymentDt(String paymentDt) {
		this.paymentDt = paymentDt;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getCreaditInfo() {
		return creaditInfo;
	}
	public void setCreaditInfo(String creaditInfo) {
		this.creaditInfo = creaditInfo;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddDetail() {
		return addDetail;
	}
	public void setAddDetail(String addDetail) {
		this.addDetail = addDetail;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getTotPayment() {
		return totPayment;
	}
	public void setTotPayment(int totPayment) {
		this.totPayment = totPayment;
	}
}
