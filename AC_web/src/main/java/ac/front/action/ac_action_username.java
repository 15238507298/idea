package ac.front.action;

import ac.front.beans.acl_beans_user;
import ac.front.mapper.acl_username;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("umanager/")
public class ac_action_username {


    @Autowired
    private acl_username username;

    @PostMapping("registUser/")
    public String registUser(@RequestParam("user1") acl_beans_user user, HttpSession session) {
        System.err.println(user);
        try {
            username.insertUser(user);
            return "front/ac_index";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "front/ac_regist";
    }

    @GetMapping("goRegist/")
    public String goRegist() {
        return "ac_regist";
    }
}
