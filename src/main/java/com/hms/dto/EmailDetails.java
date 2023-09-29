package com.hms.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmailDetails {

 private String recipient;
 private String msgBody;
 private String subject;

public String getRecipient() {
	return recipient;
}
public String getMsgBody() {
	return msgBody;
}
public String getSubject() {
	return subject;
}
public void setRecipient(String recipient) {
	this.recipient = recipient;
}
public void setMsgBody(String msgBody) {
	this.msgBody = msgBody;
}
public void setSubject(String subject) {
	this.subject = subject;
}
 
 
}