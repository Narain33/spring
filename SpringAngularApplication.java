package com.project.SpringAngular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
public class SpringAngularApplication {
	database db;
	@Autowired
	public SpringAngularApplication( database db,repo Repo){
		this.db=db;
		this.Repo=Repo;
	}


	repo Repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularApplication.class, args);
	}
	@GetMapping("/")
	public String nk()
	{

		return "sigin";
	}

	@PostMapping("/login")
	public String login(@RequestParam("username") String name,@RequestParam("password") String pasword){
		System.out.println(name+" "+pasword);
		return "index";
	}
	@PostMapping("/sigup")
	public String sigin(@RequestParam("user_name") String user_name,
						@RequestParam("user_email") String user_email,
						@RequestParam("user_password") String user_password,
						@RequestParam("c_password") String c_password,
						@RequestParam("user_age") String user_age,
						@RequestParam("user_bio") String user_bio,
						@RequestParam("user_interest") String user_interest) {
            			if (!user_password.equals(c_password)) {
			               return "/index";
		                 }


//		database db = new database();
		db.setUser(user_name);
		db.setPassword(user_password);
		db.setAge(user_age);
		db.setEmail(user_email);
		db.setCpass(c_password);
		db.setBio(user_bio);
		db.setIntrest(user_interest);

		Repo.save(db);

		System.out.println(user_name + " " + user_email + " " + user_password + " " + c_password + " " + user_age + " " + user_bio + " " + user_interest);

		// Redirect to the desired page after successful signup
		return "redirect:/login"; // Redirect to the login page
	}



}
