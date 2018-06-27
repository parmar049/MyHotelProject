package com.parmar.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
/**
 * This class provides restful API
 * @author karan
 *
 */
public class WebServicesController {
	@RequestMapping(value="/WebServices/Sample",method=RequestMethod.GET)
	@ResponseBody//ResponseBody indicates that this method is returning response.
	public String responseAPI() {
		return "{\"SampleJSONNode\":\"Data\"}";
	}
}
