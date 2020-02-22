package com.cdc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JsppageLink {
	
	@RequestMapping("/")
	public String CdcNot()
	{
		return "CdcNotice.jsp";
	}
	
	
	@RequestMapping("/Sa")
	public String StudApp()
	{
		return "StudentApply.jsp";
	}
	
	@RequestMapping("/s")
	public String v()
	{
		return "ViewPostedNotices.jsp";
	}
	
	@RequestMapping("/sl")
	public String vm()
	{
		return "cdcviewnotices.jsp";
	}

	
}
