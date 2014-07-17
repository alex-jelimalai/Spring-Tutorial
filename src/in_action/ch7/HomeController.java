package in_action.ch7;


import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;

import in_action.ch5.SpitterService;

/**
 * Created with IntelliJ IDEA.
 * User: Alexandr
 * Date: 04.11.13
 * Time: 0:05
 * To change this template use File | Settings | File Templates.
 */
//@Controller
public class HomeController {
    public static final int DEFAULT_SPITTLES_PER_PAGE = 25;

    private SpitterService spitterService;

//    @Inject
    public HomeController(SpitterService spitterService) {
        this.spitterService = spitterService;
    }

    @RequestMapping({"/", "/home"})
    public String showHomePage(Map<String, Object> model) {
        model.put("spittles", spitterService.getRecenntSpittle(DEFAULT_SPITTLES_PER_PAGE));
        return "home";
    }
}
