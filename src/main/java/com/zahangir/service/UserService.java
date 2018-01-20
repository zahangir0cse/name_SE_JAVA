package com.zahangir.service;

import java.util.List;
import com.zahangir.model.User;

public interface UserService {
	void addUser(User user);
	void updateUser(User user);
	User getUserById(int userId);
	List<User> getAllUser();
	void deleteUserById(int userId);
}
