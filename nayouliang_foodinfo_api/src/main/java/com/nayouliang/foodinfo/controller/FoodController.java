package com.nayouliang.foodinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.foodinfo.base.APIRequest;
import com.foodinfo.base.APIResult;
import com.foodinfo.base.BaseController;
import com.foodinfo.facade.FoodInfoFacade;

@RequestMapping("food")
@Controller
public class FoodController  extends BaseController{

	@Autowired
	FoodInfoFacade foodInfoFacade;
	
	@RequestMapping(value = "/infos",method=RequestMethod.GET)
	@ResponseBody
	public APIResult foodList() {
		initParams();
		APIResult result = foodInfoFacade.foodList(this.apiRequest);
		
		return result;
	}
	@RequestMapping(value = "/info",method=RequestMethod.POST)
	@ResponseBody	
	public APIResult addFood() {
		initParams();
		APIResult result = foodInfoFacade.addFood(this.apiRequest);
		return result;
		
	}
	
	
	@RequestMapping(value = "/info",method=RequestMethod.PUT)
	@ResponseBody
	public APIResult updateFood() {
		initParams();


		return new APIResult();
	}
	@RequestMapping(value = "/info",method=RequestMethod.DELETE)
	@ResponseBody	
	public APIRequest delFood() {
		initParams();

		return null;
		
	}
	
	
	@RequestMapping(value = "/info/focus",method=RequestMethod.POST)
	@ResponseBody	
	public APIResult addFoodFocus() {
		initParams();

		return null;
		
	}
	
	@RequestMapping(value = "/info/cancel",method=RequestMethod.POST)
	@ResponseBody	
	public APIResult addFoodCancel() {
		initParams();

		return null;
		
	}
	
	@RequestMapping(value = "/infos/search",method=RequestMethod.GET)
	@ResponseBody
	public APIResult searchFood() {
		initParams();
		
		return new APIResult();
	}
	
}
