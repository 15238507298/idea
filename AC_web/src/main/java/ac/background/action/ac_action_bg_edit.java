package ac.background.action;

import ac.front.beans.ac_beans_edit;
import ac.front.repos.ac_edit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ac_action_bg_edit {
    @Autowired
    private ac_edit edit;

    @RequestMapping(value = "bg_save_edit/", method = RequestMethod.POST)
    @CachePut(key = "{#edit1.ac_edit_id}", value = "edit", unless = "#result eq null")
    public String save_edit(ac_beans_edit edit1) {

        ac_beans_edit s = edit.saveAndFlush(edit1);
        if (s.getAc_edit_name().equals(edit1.getAc_edit_name())) {
            return "1";
        }
        return "0";
    }

    @CacheEvict(value = "edit", key = "edit_id")
    @RequestMapping(value = "bg_del_edit/", method = RequestMethod.POST)
    public String del_wdit(int edit_id) {
        edit.deleteById(edit_id);
        return "1";
    }
}
