package myproject.entity;

import java.util.Objects;

public class Contact {
	
	private int contactId;
	private int userId;
	private String name;
	private String email;
	private String phoneNo;
	private String message;
	
	public Contact(int contactId, int userId, String name, String email, String phoneNo, String message) {
		super();
		this.contactId = contactId;
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.message = message;
	}
	
	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contactId, email, message, name, phoneNo, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return contactId == other.contactId && Objects.equals(email, other.email)
				&& Objects.equals(message, other.message) && Objects.equals(name, other.name)
				&& Objects.equals(phoneNo, other.phoneNo) && Objects.equals(userId, other.userId);
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", userId=" + userId + ", name=" + name + ", email=" + email
				+ ", phoneNo=" + phoneNo + ", message=" + message + "]";
	}
	
}
