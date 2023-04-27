package com.coderscampus.AssignmentSubmissionApp.service;





import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.coderscampus.AssignmentSubmissionApp.domain.Authorities;
import com.coderscampus.AssignmentSubmissionApp.domain.User;
import com.coderscampus.AssignmentSubmissionApp.repository.AuthorityRepository;
import com.coderscampus.AssignmentSubmissionApp.repository.UserRepository;

@Service
public class SeedService {
	
	@Autowired
	private AuthorityRepository authorityRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public void seedAuthoritiesTable() {
	 
		
		List<Authorities> auth = authorityRepository.findAll();
		Optional<User> u = userRepository.findById(1L);
		
		if(auth == null || auth.size() <= 0) {
			
				Authorities authority = new Authorities();
				authority.setId(1L);
				authority.setAuthority("ROLE_ADMIN");
				authority.setUser(u.get());
				System.out.println(authority.getAuthority());
				Authorities authority2 = new Authorities();
				authority2.setId(2L);
				authority2.setAuthority("ROLE_INSTRUCTOR");
				authority2.setUser(u.get());
				System.out.println(authority2.getAuthority());
				Authorities authority3 = new Authorities();
				authority3.setId(3L);
				authority3.setAuthority("ROLE_CODE_REVIEWER");
				authority3.setUser(u.get());
				System.out.println(authority3.getAuthority());
				
				authorityRepository.save(authority);
				authorityRepository.save(authority2);
				authorityRepository.save(authority3);
				System.out.println(authority.getUser().getName() + "   " +  authority.getUser().getUsername());
			
			
		}
	}
}
