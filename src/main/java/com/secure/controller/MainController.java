package com.secure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.secure.model.User;
import com.secure.service.UserService;

@Controller
public class MainController {
	
	@Autowired
    private UserService userService;
	
	@GetMapping("/")
	public String home() {
        return "redirect:/users";
    }
	
	@GetMapping("/view")
	    public String view(Model model) {
		 model.addAttribute("msg", "Hello #87");
	       return "model1";
	    }
	
	@GetMapping("/users")
	public String getUsersDetails(ModelMap userModel) {
		userModel.addAttribute("users", userService.getAll());
		return "users";
	}
	
	@GetMapping("/users/new")
    public String getSignUp(Model model) {
        model.addAttribute("user", new User());
        return "/sign_up";
    }
	
	@PostMapping("/users/new")
    public String signUp(@ModelAttribute User user) {
		userService.add(user);
        return "redirect:/users";
    }
	 
}
