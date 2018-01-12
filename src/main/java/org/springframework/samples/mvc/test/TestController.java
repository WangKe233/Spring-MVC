package org.springframework.samples.mvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by WK on 2018/1/12.
 */
@Controller

public class TestController {
    @RequestMapping("/test")
    public @ResponseBody String test(){
        return "Just For Test!!! hello world mylove Alice GGGG";
    }
}
