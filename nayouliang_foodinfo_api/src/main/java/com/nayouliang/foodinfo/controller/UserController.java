package com.nayouliang.foodinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.foodinfo.base.APIRequest;
import com.foodinfo.base.APIResult;
import com.foodinfo.base.BaseController;


@RequestMapping("food")
@Controller
public class UserController  extends BaseController{

	
	@RequestMapping(value = "/users",method=RequestMethod.GET)
	@ResponseBody
	public APIResult UserList() {
		

		return new APIResult();
	}
	@RequestMapping(value = "/user",method=RequestMethod.POST)
	@ResponseBody	
	public APIRequest addUser() {
		
		return null;
		
	}
	
	
	@RequestMapping(value = "/user",method=RequestMethod.PUT)
	@ResponseBody
	public APIResult updateUser() {
		

		return new APIResult();
	}
	@RequestMapping(value = "/user",method=RequestMethod.DELETE)
	@ResponseBody	
	public APIRequest delUser() {
		
		return null;
		
	}
	
	
	@RequestMapping(value = "/login",method=RequestMethod.POST)
	@ResponseBody	
	public APIRequest login() {
		
		return null;
		
	}
	
	@RequestMapping(value = "/logout",method=RequestMethod.POST)
	@ResponseBody	
	public APIRequest logout() {
		
		return null;
		
	}
	
	 
	
}
