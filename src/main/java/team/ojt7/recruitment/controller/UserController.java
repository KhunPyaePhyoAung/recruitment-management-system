package team.ojt7.recruitment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import team.ojt7.recruitment.model.dto.UserDto;
import team.ojt7.recruitment.model.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/admin/user/add", method = RequestMethod.GET)
	public String addNewUser(ModelMap model) {
		model.addAttribute("user",new UserDto());		
		return "adduser";
	}

	@RequestMapping(value = "/admin/user/edit", method = RequestMethod.GET)
	public String editUser() {
		return "edituser";

	}

	public void saveUser() {
	}

	@RequestMapping(value = "admin/user/detail", method = RequestMethod.GET)
	public String showUserDetail() {
		return "userdetail";

	}

	@RequestMapping(value = "/admin/user/delete", method = RequestMethod.GET)
	public String deleteUser() {
		return "users";
	}

	@RequestMapping(value = "/admin/user/search", method = RequestMethod.GET)
	public String searchUsers() {
		return "users";

	}
	@RequestMapping(value = "/admin/user/profile", method = RequestMethod.GET)
	public String showUserprofile() {
		return "userprofile";

	}
	@RequestMapping(value = "/admin/user/editprofile", method = RequestMethod.GET)
	public String Editprofile() {
		return "editprofile";

	}

}