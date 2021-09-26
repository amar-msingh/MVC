package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.LoginDAO;
import com.lti.pojo.Login;

@Service
public class LoginService {
@Autowired
LoginDAO logindao;
public boolean validateLogin(Login login)
{
	return logindao.validateLogin(login);
}
}
