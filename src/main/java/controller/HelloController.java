package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping(value = "/first")
public class HelloController {
	
	@RequestMapping(value = "/caller1.he", method = RequestMethod.GET)
	public String home(Model model) {
		//메소드 이름은 맘대로
		model.addAttribute("greeting", "여러분, 안녕하세요.");
		model.addAttribute("message", "오늘은 1월28일 목요일입니다.");

		return "hello";
		//"hello"는 hello.jsp를 의미합니다.
		//xml파일 beans의 prefix와 suffix와 결합하면 /WEB-INF/hello/hello.jsp 로 문자열이 결합됩니다.
	}
	@RequestMapping(value="/hohoho.he", method = RequestMethod.GET)
	public ModelAndView hohoho() {
		ModelAndView mav = new ModelAndView("hohoho");
		//hohoho.jsp로 가라는 의미로 매개변수를 hohoho로 지정함
		mav.addObject("hohoho", "안녕하세요~~~호호호");
		//뷰인 hohoho.jsp 에 보낼 값을 "안녕하세요~~~호호호" 으로 지정
		
		List<String> lists = new ArrayList<String>();
		lists.add("가나");
		lists.add("다라");
		lists.add("마바");
		
		mav.addObject("lists", lists);
		
		return mav;
	}
	
	@RequestMapping(value = "/hahaha.he", method = RequestMethod.GET)
	public String haha() {
		return "hhhahaha";
	}
	
// jsp에서 request(요청)에 의해 gotopage(/first/caller1.he)로 가도록 요구
// 클래스의 value 와 메소드의 value를 합치면 jsp에서 들어온 요청인 first/caller1.he 가 완성되어 들어오게 됩니다. 
// 요청을 바로 처리할 수 없고, 객체를 이용해야 처리할 수 있음 (hello-context.xml => component:scan 필요! ) => controller 어노테이션 지정 
}
