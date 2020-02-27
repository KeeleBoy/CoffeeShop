package co.grandcircus.CoffeeShopLab;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.CoffeeShopLab.Dao.ProductRepository;
import co.grandcircus.CoffeeShopLab.Dao.usersDao;
import co.grandcircus.CoffeeShopLab.Objects.Products;
import co.grandcircus.CoffeeShopLab.Objects.Users;
import co.grandcircus.CoffeeShopLab.Objects.favorite;

@Controller

public class CoffeeController {

	@Autowired
	ProductRepository productsdao;

	@Autowired
	usersDao usersdao;

	@Autowired
	private HttpSession sesh;

//	@RequestMapping("/")
//	public ModelAndView index() {
//		return new ModelAndView("home");
//	}

	@RequestMapping("/")
	public ModelAndView home2(@SessionAttribute(name = "preference", required = false) favorite fav) {
		ModelAndView mav = new ModelAndView("home");
		List<Products> products = productsdao.findAll();
		mav.addObject("products", products);
		if (fav != null) {
			mav.addObject("favorite", fav);
		}

		return mav;

	}

	@PostMapping("/")
	public ModelAndView home3(favorite fav) {
		sesh.setAttribute("preference", fav);
		return new ModelAndView("redirect:/");

	}

	@RequestMapping("/add")
	public ModelAndView createAccount() {
		return new ModelAndView("add");

	}

	@RequestMapping("/edit")
	public ModelAndView edit(@RequestParam("id") Long id) {
		ModelAndView mav = new ModelAndView("edit");
		mav.addObject("product", productsdao.findById(id).orElse(null));
		// first thing in quotes is what you call it
		// second is what you add, get it from the dao
		// <td><a href="/edit?id=${ product.id }"
		return mav;
//		List<Products> products = productsdao.findById(id);
//		return new ModelAndView("edit", "products", products);

	}

	@RequestMapping("/admin")
	public ModelAndView admin() {
		List<Products> products = productsdao.findAll();

		return new ModelAndView("admin", "products", products);
	}

	@RequestMapping("/additem")
	public ModelAndView additem() {
		return new ModelAndView("additem");

	}

	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam("id") Long id) {
		productsdao.deleteById(id);
		return new ModelAndView("redirect:/admin");

	}

	@PostMapping("/accept")
	public ModelAndView submitCreateForm(Products product) {
		productsdao.save(product);
		return new ModelAndView("redirect:/admin");
	}

	@PostMapping("/update")
	public ModelAndView submitEditForm(Products product) {
		productsdao.save(product);
		return new ModelAndView("redirect:/admin");
	}

	@RequestMapping("/confirm")
	public ModelAndView confirm(@RequestParam("first_name") String first_name,
			@RequestParam("last_name") String last_name, @RequestParam("email") String email,
			@RequestParam("phone_number") String phone_number, @RequestParam("password") String password) {

		ModelAndView mv = new ModelAndView("confirm");
		mv.addObject("first_name", first_name);
		mv.addObject("last_name", last_name);
		mv.addObject("email", email);
		mv.addObject("phone_number", phone_number);
		mv.addObject("password", password);
		return mv;

	}

	@RequestMapping("/confirm/yes")
	public ModelAndView doconfirm(@RequestParam("first_name") String first_name,
			@RequestParam("last_name") String last_name, @RequestParam("email") String email,
			@RequestParam("phone_number") String phone_number, @RequestParam("password") String password) {

		Users user = new Users();

		user.setFirst_name(first_name);
		user.setLast_name(last_name);
		user.setEmail(email);
		user.setPhone_number(phone_number);
		user.setPassword(password);

		usersdao.create(user);
		return new ModelAndView("redirect:/home");

	}

}
