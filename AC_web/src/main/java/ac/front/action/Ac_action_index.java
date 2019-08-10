package ac.front.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ac_action_index {
    @RequestMapping("/")
    public String visit() {
        return "front/ac_index";
    }
}
