package controll;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registration")
public class User {
		@Id
		private String userid;
		
		private String fname;
		private String lname;
		private String email;
		private String mobile;
		private String password;
		public String getUserid() {
			return userid;
		}
		public String getFname() {
			return fname;
		}
		public String getLname() {
			return lname;
		}
		public String getEmail() {
			return email;
		}
		public String getMobile() {
			return mobile;
		}
		public String getPassword() {
			return password;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
}
