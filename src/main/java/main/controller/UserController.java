package main.controller;
import main.entity.UserEntity;
import main.reponsitory.UserReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.jws.WebParam;

@Controller
public class UserController {
    @Autowired
    UserReponsitory userReponsitory;
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(Model model){
        model.addAttribute("user",new UserEntity());
        return "login";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String register(Model model,UserEntity user){
        userReponsitory.save(user);
        return "index";
    }
}
