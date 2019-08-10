package ac.background.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("bg/")
public class ac_action_bg_index {

    @RequestMapping(value = "index/")
    public String bg_index() {
        return "back/index";
    }
}
