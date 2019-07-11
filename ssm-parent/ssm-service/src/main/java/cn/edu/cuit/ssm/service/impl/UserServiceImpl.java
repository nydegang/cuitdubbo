package cn.edu.cuit.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.cuit.ssm.mapper.UserMapper;
import cn.edu.cuit.ssm.service.UserService;
/**
 * 
 * 南阳德刚版权所有<br>
 * 个人主页http://www.guodexian.com<br>
 * 2019年7月11日上午9:52:32
 * 说明:注意修改注解
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean login(String name, String pass) {
		int ret=userMapper.findUserByNameAndPwd(name, pass);
		if (ret>0) {
			return true;
		}
		return false ;
	}

}
