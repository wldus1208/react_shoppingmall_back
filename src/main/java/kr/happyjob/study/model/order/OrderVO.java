package kr.happyjob.study.model.order;

import java.util.List;

public class OrderVO {

	private String orderId;
	private String loginid;
	private String paymentDt;
	private String paymentMethod;
	private String creaditInfo;
	private String amount;
	private String status;
	private String phone;
	private String address;
	private String addDetail;
	private String zip;
	private String location;
	private int totPayment;
	private String detailId;
	private int rewords;
	
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
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	private String brand;
	private String detailName;
	private String img;
	
	public String getDetailId() {
		return detailId;
	}
	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
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
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
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
	public int getRewords() {
		return rewords;
	}
	public void setRewords(int rewords) {
		this.rewords = rewords;
	}
	
}
