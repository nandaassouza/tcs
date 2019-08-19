package com.springAngular.demo.services;

import Java.util.ArrayList;
import Java.util.Arrays;
import Java.util.HashSet;
import Java.util.List;
import Java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springAngular.demo.models.Role;
import com.springAngular.demo.models.Users;
import com.springAngular.demo.repositories.RoleRepository;
import com.springAngular.demo.repositories.UsersRepository;

@Service
public class CustomUsersDetailsService implements UserDetailsService{

    @Autowired
    private UsersRepository usersRepository;
    
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder bCryptPasswordEncoder;
    
    public User findByEmail(String email){
        return usersRepository.findByEmail(email);
    }

    public void saveUser(Users user){
        
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setEnabled(true);
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<>(Arrays.asList(userRole)));
        usersRepository.save(user);

    }

    @Override
    public UserDetails loadUserByUserName(String email) throw UsernameNotFoundException{
        Users user = usersRepository.findByEmail(email);
        if (user != null) {
            List<GrantedAuthority> authorities = getUserAuthority(user.getRole());
            return buildUserForAuthentication(user, authorities);
        } else {
            throw new UsernameNotFoundException("Usuário não existe! Username not found!");
        }
    }

    private List<GrantedAuthority> getUserAuthority(set<Role> userRoles) {
        Set<GrantedAuthority> roles = new HashSet<>();
        userRoles.forEach((role)->{role.add(new SimpleGrantedAuthority(role.getRole()));});
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>(roles);
        return grantedAuthorities;
    }

    private UserDetails buildUserForAuthentication(Users user, List<GrantedAuthority> authorities){
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), authorities);
    }
}


