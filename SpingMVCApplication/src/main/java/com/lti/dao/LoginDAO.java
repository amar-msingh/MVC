package com.lti.dao;

import org.springframework.stereotype.Repository;

import com.lti.pojo.Login;
@Repository
public class LoginDAO {
public boolean validateLogin(Login log)
{
	if(log.getLoginname().equals("sa")&&log.getPassword().equals("sa123"))
		return true;
	else
		return false;
}
}
