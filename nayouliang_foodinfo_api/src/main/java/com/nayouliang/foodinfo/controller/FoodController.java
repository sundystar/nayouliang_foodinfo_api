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
public class FoodController  extends BaseController{

	
	@RequestMapping(value = "/infos",method=RequestMethod.GET)
	@ResponseBody
	public APIResult foodList() {
		

		return new APIResult();
	}
	@RequestMapping(value = "/info",method=RequestMethod.POST)
	@ResponseBody	
	public APIRequest addFood() {
		
		return null;
		
	}
	
	
}
