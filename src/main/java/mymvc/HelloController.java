package mymvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by menghu on 2017/7/3.
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello(){
        return "index";
    }

    @RequestMapping("/viewIndex")
    public String viewHello(){
        return "indexx";
    }
}
