package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by JavaMan on 2017/03/01.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public  String home(Model model) {
        String msg = "Hello World";
        model.addAttribute("msg",msg);
        return "index";
    }
}
