package rom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import rom.config.AppConfig;
import rom.entity.UserEntity;
import rom.sample.SampleBean;
import rom.sample.impl.SampleBeanImpl;

import java.util.Date;


/**
 * Created by Java on 2017/03/01.
 */
@Controller
public class IndexController {

    private final SampleBean sampleBean;

    // コンストラクタに@AutowiredでBeanを取得できる
    @Autowired
    public IndexController(SampleBean sampleBean) {
        this.sampleBean = sampleBean;
    }

    @Autowired
    public JdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    public ModelAndView home() {

        //ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //SampleBean bean = (SampleBean)applicationContext.getBean(SampleBean.class);

        // ModelAndViewのインスタンス生成
        ModelAndView modelAndView = new ModelAndView("index");

        String msg = sampleBean.getMessage();

       UserEntity userEntity = new UserEntity();
       modelAndView.addObject("userEntity", userEntity);

        modelAndView.addObject("msg1",msg);
        modelAndView.addObject("msg2",new Date());

        return modelAndView;

    }

    /*
     * クエリストリングのサンプルメソッド
     */
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public ModelAndView query(@RequestParam(value = "userId") Integer qid ) {
        ModelAndView mav = new ModelAndView("sample");
        mav.addObject("ID", qid);
        return mav;
    }

    /*
     * Formからの値取得メソッド
     */
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public String form(Model model,@ModelAttribute("userEntity") UserEntity userEntity) {
        model.addAttribute("formId", userEntity.getName());
        return "sample";
    }

    /*
     * 動的に変化するリクエスト処理メソッド
     */
    @RequestMapping(value = "/query/{hogeId}", method = RequestMethod.GET)
    public ModelAndView dynamic(@PathVariable("hogeId") String hogeid) {
        ModelAndView mav = new ModelAndView("sample");
        mav.addObject("hogeid", hogeid);
        return mav;
    }
}
