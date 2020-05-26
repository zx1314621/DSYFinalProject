package dao;

import po.User;

public interface UserDao {

	public User selectUserById(Integer userId);
}
