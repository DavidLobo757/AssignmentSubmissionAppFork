package com.coderscampus.proffesso.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.coderscampus.AssignmentSubmissionApp.service.SeedService;
import com.coderscampus.proffesso.domain.Authority;
import com.coderscampus.proffesso.domain.ProffessoUser;
import com.coderscampus.proffesso.repository.ProffessoAuthorityRepo;
import com.coderscampus.proffesso.repository.ProffessoUserRepo;

@Service
public class ProffessoSeedService {
	
		@Autowired
		private ProffessoAuthorityRepo proffessoAuthorityRepo;
	
		@Autowired
		private ProffessoUserRepo proffessoUserRepo;
		
		@Autowired
	    private SeedService seedService;
		
		
		// NOTE TO SELF REFACT CODE such as instead of copying the code do a for loop or while loop to stop creating the same authorities
		
		public void seedUsersTable() {
			List<ProffessoUser> u = proffessoUserRepo.findAll();
			
			
			Random random = new Random();
			String[] emails = {"example@gmail.com", "testing@gmail.com", "Daniel34@yahoo.com", "123Carol@outlook.com", "somerandomemail@gmail.com",
							   "tryingout@yahoo.com", "onemandearmy@hotmail.com", "cooldude101@gmai"};
			String[] authoritiess = {"ROLE_ADMIN", "ROLE_INSTRUCTOR", "ROLE_STUDENT", "ROLE_CODE_REVIEWER"};
			
				 if(u == null || u.size() <= 0) {
					
					 	Long i3 = 3L;
					 	Long i2 = 1L;
					 	Long i = 1L;
					 	
					 	while (i < 10) {
					 		
					 		String email = emails[random.nextInt(emails.length )];
					 		
					 		ProffessoUser user = new ProffessoUser();
					 			user.setId(i);
					 			user.setEmail(email);
					 			user.setName("example");
					 			user.setPassword(new BCryptPasswordEncoder().encode("password"));
					 		proffessoUserRepo.save(user);
					 			
						 		Authority authority = new Authority();
						 		authority.setId(i2);
						 		authority.setAuthority(authoritiess[0]);
						 		authority.setUser(user);
						 		proffessoAuthorityRepo.save(authority);
						 		Authority authority2 = new Authority();
						 		authority2.setId(i2);
						 		authority2.setAuthority(authoritiess[1]);
						 		authority2.setUser(user);
						 		proffessoAuthorityRepo.save(authority2);
						 		Authority authority3 = new Authority();
						 		authority3.setId(i2);
						 		authority3.setAuthority(authoritiess[2]);
						 		authority3.setUser(user);
						 		proffessoAuthorityRepo.save(authority3);
					 		
					 		System.out.println("ID: " + user.getId() + " Email: " + user.getEmail() + " Name: " + user.getName() + " Password: " + "password");
					 		i2 = i2 + i3;
					 		i++;
					 	}
		             
//		             seedService.seedAuthoritiesTable(); // I will add this in the next part
		        } else {
		            System.out.println("There are users");
		        }

		}
		

	}