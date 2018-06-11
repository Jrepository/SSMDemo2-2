package indi.ssm.dao;

import java.util.List;

import indi.ssm.pojo.User;

public interface UserMapper {
	List<User> selectUser();
}
