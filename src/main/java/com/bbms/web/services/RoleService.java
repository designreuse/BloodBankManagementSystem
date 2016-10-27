package com.bbms.web.services;


import com.bbms.web.models.Role;
import java.util.List;

public interface RoleService {

    List<Role> findAll();

    Role findRoleById(int id);

    Role findRoleByCode(String code);

    void dumpDummyRole();
}
