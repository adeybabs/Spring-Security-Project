package com.SecurityProject.SecurityProject;

import com.SecurityProject.SecurityProject.models.AppUser;
import com.SecurityProject.SecurityProject.models.Role;
import com.SecurityProject.SecurityProject.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class SecurityProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityProjectApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {

			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			userService.saveUser(new AppUser(null, "Jon Doe", "Jon", "4321",new ArrayList<>()));
			userService.saveUser(new AppUser(null, "Jane Dane", "Jane", "jane21",new ArrayList<>()));
			userService.saveUser(new AppUser(null, "Fisher Rey", "Rey", "fish",new ArrayList<>()));
			userService.saveUser(new AppUser(null, "Dreamer Gal", "Dreamer", "dream",new ArrayList<>()));

			userService.addRoleToUser("Jon", "ROLE_USER");
			userService.addRoleToUser("Jane", "ROLE_SUPER_ADMIN");
			userService.addRoleToUser("Jane", "ROLE_ADMIN");
			userService.addRoleToUser("Rey", "ROLE_USER");
			userService.addRoleToUser("Dreamer", "ROLE_MANAGER");
			userService.addRoleToUser("Jon", "ROLE_ADMIN");


		};
	}

}
