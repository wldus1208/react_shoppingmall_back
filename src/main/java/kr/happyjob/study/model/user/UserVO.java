package kr.happyjob.study.model.user;

public class UserVO {

	// 로그인 & 회원가입 컬럼
	private String loginid;
	private String name;
	private String loginpw;
	private String email;
	
	private String grade;
	private String img;
	private String birth;
	private String phone;
	private String address;
	private String addDetail;
	private String zip;
	
	
	public UserVO(String loginid, String name, String loginpw, String email) {
		super();
		this.loginid = loginid;
		this.name = name;
		this.loginpw = loginpw;
		this.email = email;
	}
	
	
	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
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


	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoginpw() {
		return loginpw;
	}
	public void setLoginpw(String loginpw) {
		this.loginpw = loginpw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	@Override
	public String toString() {
		return "LoginVO [loginid=" + loginid + ", name=" + name + ", loginpw=" + loginpw + ", email=" + email + "]";
	}
	
}
