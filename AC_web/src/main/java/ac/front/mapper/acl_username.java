package ac.front.mapper;

import ac.front.beans.acl_beans_user;
import org.springframework.stereotype.Component;


@Component
public interface acl_username {


    /**
     * @param user
     * @return
     * @throws Exception
     */
    void insertUser(acl_beans_user user) throws Exception;

    /**
     * @param user
     * @return
     * @throws Exception
     */
    public acl_beans_user findUser(acl_beans_user user) throws Exception;

    /**
     * @param user
     * @return
     * @throws Exception
     */
    public void removeUser(acl_beans_user user) throws Exception;

    /**
     * @param user
     * @return
     * @throws Exception
     */
    public void updateUser(acl_beans_user user) throws Exception;
}
