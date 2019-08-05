package ac.demo.com.ac.front.action;

import ac.demo.com.ac.front.repos.ac_edit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class ac_action_edit {

    @Autowired
    private ac_edit edit;
    @RequestMapping("front/getEdit/")
    public List getEdits(){

        return edit.findAll();
    }

}
