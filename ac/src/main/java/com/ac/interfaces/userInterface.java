package com.ac.interfaces;

import com.ac.beans.user;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface userInterface {
    List<user> findUser();
    user loginUser(user user);
    void saveUser(user user);
    void changeUser(user user);
    void removeUser(long id);
}
