package com.vcooline.demo.dubbo.web;

import com.vcooline.demo.dubbo.api.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Emac
 */
@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/demo")
    public @ResponseBody String demo() {
        return demoService.sayHello("world");
    }
}
