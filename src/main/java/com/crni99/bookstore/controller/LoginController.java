package com.crni99.bookstore.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.crni99.bookstore.model.Account;
import com.crni99.bookstore.service.AccountService;

@Controller
public class LoginController {
	@Autowired
	AccountService ac;
	@GetMapping("/login")
	public String show()
	{
		return "login";
	}
	@GetMapping("/logout")
	public String showLogout()
	{
		return "login";
	}
	@PostMapping("/login")
	public String showLoginPage(@ModelAttribute("username") String name,@ModelAttribute("password") String pass) {
		Optional<Account> name1= ac.findByusername(name);

		if (name1.get().getPassword().equals(pass))
		{
			System.out.print(pass);
			return "redirect:/book";
		}
		else
			return "redirect:/login?fail";

	}

	@GetMapping("/access-denied")
	public String showAccessDenied() {
		return "error";
	}

}