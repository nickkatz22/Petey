package com.grandcircus.spring.controller;

import com.grandcircus.spring.util.routeMe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by nickk on 5/8/2017.
 */

@Controller
public class HomeController {
    @RequestMapping ("/")
    public String displayForm() {
        return "welcome2";
    }
    @RequestMapping(value="/result", method= RequestMethod.POST)
    public ModelAndView route(@RequestParam("streetNum") String street,
                              @RequestParam("routee")String routeM,
                              @RequestParam("local")String loc,
                              @RequestParam("postal")String post,
                              @RequestParam("count")String count){
        String user= street + " " + routeM + " " + loc + " " + post + " "+count;

        return new ModelAndView("result","addStuff",user);


    }
    @RequestMapping(value="/result2", method=RequestMethod.POST)
    public ModelAndView route2(@RequestParam("strtN") String strt,
                               @RequestParam("rou")String rout,
                               @RequestParam("loca")String local,
                               @RequestParam("posta")String postal,
                               @RequestParam("userCountry")String userCount){
        String info= strt + " " + rout + " " + local + " " + postal + " " + userCount;
        return new ModelAndView("result2","addStuff2",info);

    }

}
