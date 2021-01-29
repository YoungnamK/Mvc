package controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Hobby;
import model.Human;
import model.Job;

@Controller
public class HumanController {
	
	@ModelAttribute("specialist")
	public String[] specialist () {
		String[] array = {"마라톤","중국어","아랍어"};
		return array;
	}
	
	@ModelAttribute("joblists")
	public List<Job> ddd(){
		List<Job> lists = new ArrayList<Job>();
		lists.add(new Job(0,"--선택해주세요.--"));
		lists.add(new Job(1,"학생"));
		lists.add(new Job(2,"강사"));
		lists.add(new Job(3,"직원"));
		lists.add(new Job(4,"프로그래머"));
		return lists;
	}
	@ModelAttribute("hobbies")
	public List<Hobby> hobby_list(){
		List<Hobby> lists = new ArrayList<Hobby>();
		lists.add(new Hobby("reading","독서"));
		lists.add(new Hobby("movie","영화감상"));
		lists.add(new Hobby("baseball","야구"));
		lists.add(new Hobby("football","축구"));
		return lists;
	}
	
	
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
	
	@ModelAttribute("human")
	public Human some() {
		return new Human();
	}
	@RequestMapping(value="/caller3.hm", method=RequestMethod.POST)
	public ModelAndView doPost(@ModelAttribute("human") @Valid Human human, BindingResult errors) {
		//valid 뒤의 human은 현재 메소드에서 참조하는 이름이고,
		//modelAttribute는 jsp에서 참조하는 이름입니다.
		// Human 커맨드에 대해 유효성검사를 진행한다는 의미이며, 
		//valid 어노테이션이 bindingresult 보다 앞에 있어야함
		ModelAndView mav = new ModelAndView();
		
//		System.out.println(id);
//		System.out.println(name);
		System.out.println(human.toString());
		System.out.println(errors.toString());
		if (errors.hasErrors()) {
			mav.setViewName("humanStart");
			System.out.println("no");
		}else {
		mav.setViewName("humanEnd");
		System.out.println("yes");
		}
		return mav;
	}
	
}
