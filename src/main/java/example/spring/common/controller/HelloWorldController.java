package example.spring.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController
{
    @RequestMapping(path={"/hello"}, method = RequestMethod.GET)
	protected ModelAndView displayHhelloWorld()
    {
        ModelAndView modelAndView = new ModelAndView("HelloWorld");
        modelAndView.addObject("msg", "Hello World!!");
        return modelAndView;
	}

}