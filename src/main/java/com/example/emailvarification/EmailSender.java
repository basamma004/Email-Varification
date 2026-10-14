package com.example.emailvarification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSender {
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendmail(String Toemail, String subject, String Body) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom("santagerib@gmail.com");
		mailMessage.setTo(Toemail);
		mailMessage.setText(Body);
		mailMessage.setSubject(subject);
		javaMailSender.send(mailMessage);
		System.out.println("Email sent succesfully");
	}

}
