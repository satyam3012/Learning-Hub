package myproject.entity;

import java.util.Objects;

public class Feedback {
	
	private int feedbackId;
	private int userId;
	private String name;
	private String email;
	private String feedback;
	
	public Feedback(int feedbackId, int userId, String name, String email, String feedback) {
		super();
		this.feedbackId = feedbackId;
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.feedback = feedback;
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
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

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, feedback, feedbackId, name, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Feedback other = (Feedback) obj;
		return Objects.equals(email, other.email) && Objects.equals(feedback, other.feedback)
				&& feedbackId == other.feedbackId && Objects.equals(name, other.name) && userId == other.userId;
	}

	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", userId=" + userId + ", name=" + name + ", email=" + email
				+ ", feedback=" + feedback + "]";
	}
	
	
}
