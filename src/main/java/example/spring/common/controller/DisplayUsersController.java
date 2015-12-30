package example.spring.common.controller;

import example.spring.common.model.Address;
import example.spring.common.model.Person;
import example.spring.common.model.PhoneNumber;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class DisplayUsersController
{
    @RequestMapping(path={"/users"}, method = RequestMethod.GET)
    protected ModelAndView displayUsers()
    {
        Person p = new Person();
        p.setName("Sam Dalton");
        p.setAge(26);
        Address a = new Address();
        a.setLine1("221b Baker Street");
        a.setTown("London");
        a.setCounty("Greater London");
        a.setPostcode("NW1 1AA");
        ArrayList al = new ArrayList();
        PhoneNumber ph = new PhoneNumber();
        ph.setStd("01895");
        ph.setStd("678901");
        al.add(ph);
        ph = new PhoneNumber();
        ph.setStd("0208");
        ph.setStd("8654789");
        al.add(ph);
        a.setPhoneNumbers(al);
        p.setAddress(a);

        ModelAndView modelAndView = new ModelAndView("DisplayUsers");
        modelAndView.addObject(p);
        return modelAndView;
    }
}
