package rom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;


/**
 * Created by Java on 2017/03/01.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public ModelAndView home() {

        // ModelAndViewのインスタンス生成
        ModelAndView modelAndView = new ModelAndView("index");

        modelAndView.addObject("msg1","Hello World");
        modelAndView.addObject("msg2",new Date());

        return modelAndView;

    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public ModelAndView query(@RequestParam(value = "userId") Integer id ) {
        ModelAndView mav = new ModelAndView("sample");
        mav.addObject("ID", id);
        return mav;
    }
}