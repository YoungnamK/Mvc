package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Human;

@Controller
public class HumanController {
	@RequestMapping(value="/mycaller.hm", method=RequestMethod.GET)
	public ModelAndView form() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("humanStart");
		return mav;
	}
	
	/*
	 * @RequestParam(value="id", required = true)String id, // String id =
	 * request.getParameter("id") 와 같음
	 * 
	 * @RequestParam(value="name", required = false)String name
	 */
	
	// @GetMapping, PostMapping(스프링4, 5버전에서는 사용가능)
	@RequestMapping(value="/caller3.hm", method=RequestMethod.POST)
	public ModelAndView doPost(Human human) {
		ModelAndView mav = new ModelAndView();
		
//		System.out.println(id);
//		System.out.println(name);
		System.out.println(human.toString());
		mav.setViewName("humanEnd");
		return mav;
	}
	
}
