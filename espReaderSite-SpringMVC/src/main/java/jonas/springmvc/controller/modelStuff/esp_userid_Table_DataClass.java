package jonas.springmvc.controller.modelStuff;

import java.util.Date;

public class esp_userid_Table_DataClass {
	private Integer userid;
	private String email;
	private String password;
	private  Date create_time;
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param create_time the create_time to set
	 */
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "esp_userid_Table_DataClass [userid=" + userid + ", email=" + email + ", password=" + password
				+ ", create_time=" + create_time + "]";
	}
	
	

}
