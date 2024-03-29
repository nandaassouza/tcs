package com.springAngular.demo.models;

import Java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")

public class Users {

    @Id
    private String id;
    @Indexed(unique=true, direction=IndexDirection.DESCENDING, dropDups=true)
    private String email;
    private String password;
    private String fullName;
    private boolean enable;
    @DBRef
    private Set<Role> roles;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String geEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public boolean getEnabled(){
        return enabled;
    }

    public void setEnabled(boolean enabled){
        this.enabled = enabled;
    }  
    
    public Set<Role> getRoles(){
        return roles;
    }

    public void setRoles(Set<Role> roles){
        this.roles = roles;
    }   
    
}