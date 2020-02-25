package co.grandcircus.CoffeeShopLab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.CoffeeShopLab.Dao.productsDao;
import co.grandcircus.CoffeeShopLab.Dao.usersDao;
import co.grandcircus.CoffeeShopLab.Objects.Users;

@Controller

public class CoffeeController {

	@Autowired
	productsDao productsdao;

	@Autowired
	usersDao usersdao;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("home");
	}

	@RequestMapping("/add")
	public ModelAndView createAccount() {
		return new ModelAndView("add");

	}

	@RequestMapping("/confirm")
	public ModelAndView confirm(
			@RequestParam("first-name") String first_name,
			@RequestParam("last_name") String last_name, 
			@RequestParam("email") String email,
			@RequestParam("phone_number") int phone_number, 
			@RequestParam("password") String password) {

		ModelAndView mv = new ModelAndView("confirm");
		mv.addObject("first_name", first_name);
		mv.addObject("last_name", last_name);
		mv.addObject("email", email);
		mv.addObject("phone_number", phone_number);
		mv.addObject("password", password);
		return mv;

	}

	@RequestMapping("/confirm/yes")
	public ModelAndView doconfirm(
			@RequestParam("first-name") String first_name,
			@RequestParam("last_name") String last_name, 
			@RequestParam("email") String email,
			@RequestParam("phone_number") int phone_number, 
			@RequestParam("password") String password) {

		Users user = new Users();

		user.setFirst_name(first_name);
		user.setLast_name(last_name);
		user.setEmail(email);
		user.setPhone_number(phone_number);
		user.setPassword(password);
		
		usersdao.create(user);
		return new ModelAndView("Redirect:/home");

	}

}
