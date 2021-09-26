package com.lti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lti.pojo.Login;
import com.lti.service.LoginService;

@Controller
public class MyController {
	@Autowired
	LoginService loginser;
	
	
	@RequestMapping("/getlogin")//if a request comes like this
public ModelAndView getLogin() {
		//can call service/DAO
		//can create model attribute
		//	can return MModelandView/View
		ModelAndView mav=new ModelAndView("login");
		mav.addObject("login", new Login());
	return mav;
}
	@RequestMapping("/validateLogin")
	public ModelAndView validateLogin(@ModelAttribute("login") Login login)
	{
		System.out.println(login.getLoginname()+"  "+login.getPassword());
		boolean res=loginser.validateLogin(login);
		if(res)
		return new ModelAndView("Home");
		else
		{
			ModelAndView mav=new ModelAndView("login");
			mav.addObject("login",new Login());
			return mav;
		}
	}
}
