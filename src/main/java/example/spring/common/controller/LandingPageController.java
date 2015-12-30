package example.spring.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LandingPageController
{
    @RequestMapping(path={"/index", "/"}, method = RequestMethod.GET)
	protected ModelAndView displayLandingPage()
    {
        ModelAndView modelAndView = new ModelAndView("LandingPage");
        modelAndView.addObject("msg", "Landing Page!!");
        return modelAndView;
	}

}