//package com.s2p.service;
//
//import com.s2p.model.User;
//import com.s2p.dto.UserDto;
//import com.s2p.dao.IUserDAO;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//
//@Service
//public class JwtUserDetailsService implements UserDetailsService {
//	@Autowired
//	private IUserDAO userDao;
//
//	@Autowired
//	private PasswordEncoder bcryptEncoder;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////		User user = userDao.findByUsername(username);
//		User user = userDao.findByEmail(username);
//		if (user == null) {
//			throw new UsernameNotFoundException("User not found with email: " + username);
//		}
//		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
//				new ArrayList<>());
//	}
//
//	public User save(UserDto user) {
//		User newUser = new User();
//		newUser.setEmail(user.getEmail());
//		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
//		return userDao.save(newUser);
//	}
//}