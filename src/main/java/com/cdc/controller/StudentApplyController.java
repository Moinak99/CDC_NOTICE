package com.cdc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cdc.model.StudentApplyModel;
import com.cdc.service.CdcService;
import com.cdc.service.StudentApplyService;

@Controller
public class StudentApplyController {
	@Autowired
	private StudentApplyService s;
	
	
	
	
	@RequestMapping(method= {RequestMethod.POST,RequestMethod.GET}, value="/studapply")
	public ModelAndView addStudentApplyModel (  StudentApplyModel sam )
	{	
				
		sam=s.addStudentApplyModel(sam);
		
		ModelAndView mv = new ModelAndView();
		
		
		mv.addObject("regsuccessmsg", "THANKS FOR REG..NOW LOGIN");
		mv.setViewName("CdcNotice.jsp");
		
		return mv;
		
					
	}
		

		
		
}
