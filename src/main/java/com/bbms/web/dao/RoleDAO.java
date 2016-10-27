package com.bbms.web.dao;


import com.bbms.web.models.Role;
import java.util.List;

public interface RoleDAO {

    List<Role> findAll();
    
    Role findRoleById(int id);
    
    Role findRoleByCode(String code);

    void dumpDummyRole();
}
