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

import model.Baseball;
import model.Member;
import model.Tool;

@Controller
public class RegisterController {
	
	@ModelAttribute("tools")
	public List<Tool> tool_list(){
		List<Tool> lists = new ArrayList<Tool>();
		lists.add(new Tool("Netbeans","넷빈즈"));
		lists.add(new Tool("Eclipse","이클립스"));
		lists.add(new Tool("SpringToolSuite","스프링툴슈트"));
		return lists;
	}
	
	@ModelAttribute("joblists")
	public List<String> job_list(){
		List<String> lists = new ArrayList<String>();
		lists.add("---직업을 선택해주세요.");
		lists.add("강사");
		lists.add("직원");
		lists.add("학생");
		lists.add("주부");
		lists.add("기타");
		return lists;
	}
	
	@ModelAttribute("favoritesOsNames")
	public String[] osArray() {
		String[] array = {"윈도우10","비스타","윈도우7","우분투", "맥"};
		return array;
	}
	
	@ModelAttribute("sportsTeams")	// 좋아하는 야구팀
	public List<Baseball> sportsTeamList(){
		List<Baseball> lists = new ArrayList<Baseball>();
		lists.add(new Baseball("---야구팀을 선택해주세요.","-"));
		lists.add(new Baseball("삼성 라이온즈","lions"));
		lists.add(new Baseball("두산 베어스","bears"));
		lists.add(new Baseball("기아 타이거즈","tigers"));
		return lists;
	}
	
	private final String requestUrl = "/register.me";
	private final String startPage = "/meRegisterForm";
	private final String gotopage = "/meRegisterProc";
	
	@RequestMapping(value=requestUrl, method=RequestMethod.GET)
	public String handle() {
		
		return startPage;
	}
	
	@ModelAttribute("member")
	public Member some() {
		return new Member();
	}
	
	@RequestMapping(value=requestUrl, method=RequestMethod.POST)
	public ModelAndView handle(@ModelAttribute("member") @Valid Member xxx, BindingResult errors) {
		System.out.println(xxx.toString());
		ModelAndView mav = new ModelAndView();
		if (errors.hasErrors()) {
			mav.setViewName(startPage);
		}else {
			mav.setViewName(gotopage);
		}
		return mav;
	}
}
