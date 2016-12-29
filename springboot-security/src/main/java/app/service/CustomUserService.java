package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import app.dao.SysUserRepository;
import app.entity.SysUser;
@Service
public class CustomUserService implements UserDetailsService{
	@Autowired
	private SysUserRepository repository;
	@Override
	public UserDetails loadUserByUsername(String arg0)
			throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		SysUser user=repository.findByUsername();
		if(user==null){
			throw new UsernameNotFoundException("用户名 不存在");
		}
		return user;
	}

}
