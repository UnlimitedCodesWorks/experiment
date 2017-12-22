package xin.yiliya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xin.yiliya.service.UserService;

@Controller
@RequestMapping(value = "/user",method = RequestMethod.GET)
public class UserContorller {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/experiment.html",method = RequestMethod.GET)
    public String experiment(Model model){
        model.addAttribute("introduce","SpringBoot!");
        return "experiment";
    }
}
