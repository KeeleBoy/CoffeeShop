package co.grandcircus.CoffeeShopLab.Objects;

public class Users {

	private Long id;
	private String first_name;
	private String last_name;
	private String email;
	private Integer phone_number;
	private String password;

	public Users() {

	}

	@Override
	public String toString() {
		return "users [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", phone_number=" + phone_number + ", password=" + password + "]";
	}

	public Long getId() {
		return id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(Integer phone_number) {
		this.phone_number = phone_number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Users(String first_name, String last_name, String email, Integer phone_number, String password) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_number = phone_number;
		this.password = password;
	}

}