package me.yuzh.amm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecordPageController {


    @RequestMapping("/index")
    public String index(){
        return "index.html";
    }



}
