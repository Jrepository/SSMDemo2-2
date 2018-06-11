package indi.ssm.service.impl;

import indi.ssm.dao.UserMapper;
import indi.ssm.pojo.User;
import indi.ssm.service.UserService;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userMapper;
	
	@Override
	public List<User> selectUser() {
		return userMapper.selectUser();
	}
}
	