package com.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by otkurbiz on 10/15/15.
 */
@Controller
@RequestMapping(value = "/Passport")
public class PassportController {

    @RequestMapping(value = "/login" ,method = RequestMethod.GET)
    public String login(ModelMap modelMap){
        return "login";
    }


    @RequestMapping(value = "/loginAction",method = RequestMethod.POST)
    @ResponseBody
    public Object loginAction(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("name","买提");
        return map;
    }
}
