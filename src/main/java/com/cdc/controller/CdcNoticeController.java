package com.cdc.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cdc.model.CdcModel;
import com.cdc.model.StudentApplyModel;
import com.cdc.service.CdcService;
import com.cdc.service.StudentApplyService;

@Controller
public class CdcNoticeController {
	@Autowired
	private CdcService cds;
	@Autowired
	private StudentApplyService sas;
	
	@RequestMapping(method=RequestMethod.POST , value="/cdcnot")
	public ModelAndView addCdcModel (CdcModel cnm)
	{
		System.out.println("INSIDE Controller of reg emploYEE");
		cnm = cds.addCdcModel(cnm);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ViewPostedNotices.jsp");
		return mv;

	}
	
	
	@RequestMapping("/cdcviewnotices")
	public String cdcViewNotices(HttpSession session)
	{
		ArrayList<CdcModel> cdcm =cds.getAllNotices();
		session.setAttribute("notices", cdcm);
		System.out.println(cdcm.size());
		return "cdcviewnotices.jsp";
		
	}
	
/*	@RequestMapping("/cdcstudsel")
	public String cdcstud(HttpSession session)
	{
		ArrayList<CdcModel> cdcm= cds.getAllNotices();
		ArrayList<StudentApplyModel> cdd = sas.getAllNotices();
		
		session.setAttribute("a", cdcm);
		session.setAttribute("b", cdd);
		
		return "cdcselective.jsp";
	} */
}
