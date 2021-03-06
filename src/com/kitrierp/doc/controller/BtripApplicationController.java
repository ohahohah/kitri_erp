package com.kitrierp.doc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kitrierp.doc.model.BtripApplicationDto;
import com.kitrierp.doc.model.DocumentDto;
import com.kitrierp.doc.model.service.BtripApplicationService;

@Controller
@RequestMapping("/btripApplication")
public class BtripApplicationController {
	@Autowired
	private BtripApplicationService btripApplicationService;
	
	/*
	@RequestMapping(value="/applicationPage.erp", method=RequestMethod.POST)
	public ModelAndView applicationList(@RequestParam BtripApplicationDto btripApplicationDto){
		ModelAndView mav = new ModelAndView();
		int write = btripApplicationService.applicationWrite(btripApplicationDto);
		return mav;
	}
	*/
	
	@RequestMapping(value="/reportDoc.erp", method=RequestMethod.POST)
	public ModelAndView reportDoc(@RequestParam BtripApplicationDto btripApplicationDto){
		ModelAndView mav = new ModelAndView();
		int write = btripApplicationService.reportDoc(btripApplicationDto);
		return mav;
	}
	@RequestMapping(value="/tmpsaveDoc.erp", method=RequestMethod.POST)
	public ModelAndView tmpsaveDoc(@RequestParam BtripApplicationDto btripApplicationDto){
		ModelAndView mav = new ModelAndView();
		int write = btripApplicationService.tmpsaveDoc(btripApplicationDto);
		return mav;
	}
	
	@RequestMapping("/viewDoc.erp")
	public ModelAndView viewDoc(@RequestParam String doc_id) {
		ModelAndView mav = new ModelAndView();
		BtripApplicationDto btripApplicationDto = btripApplicationService.viewDoc(doc_id);
		mav.addObject("document", btripApplicationDto);
		mav.addObject("doctype", "출장신청서");
		mav.setViewName("/doc/document/btrip_application_view");
		return mav;
	}
	@RequestMapping("/modifyDoc.erp")
	public ModelAndView modifyDoc(@RequestParam String doc_id) {
		ModelAndView mav = new ModelAndView();
		BtripApplicationDto btripApplicationDto = btripApplicationService.viewDoc(doc_id);
		mav.addObject("document", btripApplicationDto);
		mav.addObject("doctype", "출장신청서");
		mav.setViewName("/doc/document/btrip_application");
		return mav;
	}
}
