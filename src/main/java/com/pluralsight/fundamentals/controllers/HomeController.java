package com.pluralsight.fundamentals.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//@RestController - didn't show the template but just returned it as a string e.g start, tickets
@Controller
public class HomeController {
//    @Value("${app.version}")
//    private String appVersion;
//
//    @GetMapping
//    @RequestMapping("/")
//    public Map getStatus() {
//        Map map = new HashMap<String, String>();
//        map.put("app-version", appVersion);
//        return map;
//    }

    /**
    * handle the root (/) and return a start page
    * @return
    */

//    @RequestMapping(value = "/", --- method = RequestMethod.GET
    @RequestMapping("/hello")
    public String index2() {
        // note: resources > templates > start.html
        // render view using the "start" template
        return "start";
    }


    @GetMapping("/tickets2")
    public String retrieveTickets() {
        return "tickets";
    }




//    // create. resources > templates > form.html
//    @GetMapping("form")
//    public String helloForm() {
//        return "form";
//    }

//    // if we have no template, don't wat to search for it
//    @GetMapping("hello/{name}")
//    @ResponseBody
//    public String helloAgain(@PathVariable String name) {}
//    return "Hello, " + name + "!";
}


//-----------------

//        I fixed this by setting a mapping like
//
//@GetMapping(value= "/")
//public String home() {
//        return "index";
//        }
//
//        or by using the Class Level Mapping
//
//@RequestMapping(value= "/")
//public class Controller {
//
//    public String home() {
//        return "home";
//    }
//
//}

