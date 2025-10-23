package com.subhash.devfolio.dao.interfaces;

import com.subhash.devfolio.entity.Role;

public interface RoleDAO {
    public Role findRoleByName(String roleName);
}
