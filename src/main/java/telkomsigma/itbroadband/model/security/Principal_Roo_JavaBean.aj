// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package telkomsigma.itbroadband.model.security;

import java.util.Set;
import telkomsigma.itbroadband.model.security.Authority;
import telkomsigma.itbroadband.model.security.Principal;

privileged aspect Principal_Roo_JavaBean {
    
    public String Principal.getName() {
        return this.name;
    }
    
    public void Principal.setName(String name) {
        this.name = name;
    }
    
    public String Principal.getPassword() {
        return this.password;
    }
    
    public void Principal.setPassword(String password) {
        this.password = password;
    }
    
    public Boolean Principal.getEnabled() {
        return this.enabled;
    }
    
    public void Principal.setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    public Set<Authority> Principal.getRoles() {
        return this.roles;
    }
    
    public void Principal.setRoles(Set<Authority> roles) {
        this.roles = roles;
    }
    
}
