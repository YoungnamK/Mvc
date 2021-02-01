package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlbumListController {
	@RequestMapping(value="/list.al")
	public ModelAndView handle() {
		System.out.println("호호호");
		
		return null;
	}
}
