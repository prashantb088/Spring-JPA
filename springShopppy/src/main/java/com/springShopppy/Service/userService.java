package com.springShopppy.Service;

import com.springShopppy.model.users;
import com.springShopppy.repository.userRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springShopppy.model.login;

@Service
public class userService {
	
	@Autowired
	private userRepository userepo;
	
	public String createNew(users u1) {
		
		userepo.save(u1);
		return "successfully registered";
	}
	
	public String login(login l1) {
		
		users u2 = userepo.findByUsername(l1.getUsername());
		if(u2!=null) {
			if(u2.getPassword().equals(l1.getPassword())) {
				return "Login Sucess!..... ";
			}
			else {
				return "Wrong Password!.....";
			}
			
		}
		else {
			return "Sorry!!....User Not Found";
		}
	}
	
}
