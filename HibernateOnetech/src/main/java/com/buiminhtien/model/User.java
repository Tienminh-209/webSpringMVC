package com.buiminhtien.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
	@Column(name = "username")
    protected String username;
	@Column(name = "password")
    protected String password;
	@Column(name = "display_name")
	 protected String display_name;
	@Column(name = "address")
	 protected String address;
	   public User() {  }
	    public User(int id, String username, String password,String display_name,String address ) {
	        this.id = id;
	        this.username = username;
	        this.password = password;
	        this.display_name = display_name;
	        this.address = address;           
	    }
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((address == null) ? 0 : address.hashCode());
			result = prime * result + ((display_name == null) ? 0 : display_name.hashCode());
			result = prime * result + id;
			result = prime * result + ((password == null) ? 0 : password.hashCode());
			result = prime * result + ((username == null) ? 0 : username.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			if (address == null) {
				if (other.address != null)
					return false;
			} else if (!address.equals(other.address))
				return false;
			if (display_name == null) {
				if (other.display_name != null)
					return false;
			} else if (!display_name.equals(other.display_name))
				return false;
			if (id != other.id)
				return false;
			if (password == null) {
				if (other.password != null)
					return false;
			} else if (!password.equals(other.password))
				return false;
			if (username == null) {
				if (other.username != null)
					return false;
			} else if (!username.equals(other.username))
				return false;
			return true;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getDisplay_name() {
			return display_name;
		}
		public void setDisplay_name(String display_name) {
			this.display_name = display_name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
}
