package com.subhash.devfolio.dao.interfaces;

import com.subhash.devfolio.entity.User;

public interface UserDAO {
    User findByUserName(String userName);
}
