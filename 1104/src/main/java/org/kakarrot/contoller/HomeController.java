package org.kakarrot.contoller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zerock.service.TimeService;

import lombok.Setter;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	// TimeService type의 객체를 달라
	@Setter(onMethod_ = @Autowired)
	private TimeService service;
	
	
//	@Autowired
//	public void setService(TimeService service) {
//		this.service = service;
//	}
	
	
	
	
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		model.addAttribute("serverTime", service.now() );
		
		return "home";
	}
	
}
