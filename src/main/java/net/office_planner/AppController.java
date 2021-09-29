package net.office_planner;

import java.util.List;

import net.office_planner.User.User;
import net.office_planner.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@Autowired
	private UserRepository userRepo;

	@GetMapping("")
	public String viewHomePage() {

		return "index";
	}

	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());

		return "signup_form";
	}

	@PostMapping("/process_register")
	public String processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);

		userRepo.save(user);

		return "register_success";
	}

	@GetMapping("/organizational_officer")
	public String viewOfficersPage(Model model) {

		return "users_page";
	}

	@GetMapping("/list_users")
	public String listUsers(Model model) {
		List<User> listUsers = userRepo.findAll();
		model.addAttribute("listUsers", listUsers);

		return "list_users";
	}

	@RequestMapping("/edit_user/{id}")
	public ModelAndView showEditUserForm(@PathVariable(name = "id") Long id) {

		ModelAndView mnv = new ModelAndView("edit_users");

		//User object
		User user = userRepo.getById(id);
		mnv.addObject("editUser", user);
		return mnv;

	}

	@RequestMapping("/delete_user/{id}")
	public String deleteUser(@PathVariable(name = "id") Long id) {
		userRepo.deleteById(id);
		return "users_page";
	}

	@PostMapping("/save_user")
	public String addNewUser(User web_user) {
		userRepo.save(web_user);
		return "list_users";
	}

//	@PostMapping("/create_user")
//	public String userCreate(User user) {
//
//		userRepo.save(user);
//		return "list_users";
//
//	}
}
