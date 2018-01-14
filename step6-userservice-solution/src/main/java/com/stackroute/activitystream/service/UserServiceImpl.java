package com.stackroute.activitystream.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.activitystream.model.User;
import com.stackroute.activitystream.repository.UserRepository;

/*
* Service classes are used here to implement additional business logic/validation 
* This class has to be annotated with @Service annotation.
* @Service - It is a specialization of the component annotation. It doesn�t currently 
* provide any additional behavior over the @Component annotation, but it�s a good idea 
* to use @Service over @Component in service-layer classes because it specifies intent 
* better. Additionally, tool support and additional behavior might rely on it in the 
* future.
* */
@Service
public class UserServiceImpl implements UserService{

	/*
	 * Autowiring should be implemented for the UserRepository.
	 *  Please note that we should not create any object using the new keyword.
	 * */
	@Autowired
	UserRepository userRepository;

	/*
	 * This method should be used to save a new user. Call the corresponding method of Respository interface.
	 * 
	 */
	public boolean save(User user) {
		boolean success = false;
		if (null == user) {
			return success;
		}

		try {
			userRepository.save(user);
			success = true;
		} catch (Exception e) {
			success = false;
		}
		return success;
	}
	/*
	 * This method should be used to update an existing user. Call the corresponding method of Respository interface.
	 * 
	 */
	public boolean update(User user) {
		boolean success = false;
		try {
			if (null != user) {
				User tempUser = userRepository.findOne(user.getUsername());
				if (null != tempUser) {
					userRepository.delete(tempUser);
					userRepository.save(user);
					success = true;
				}
			}
		} catch (Exception e) {
			success = false;
		}
		return success;
	}
	/*
	 * This method should be used to delete an existing user. Call the corresponding method of Respository interface.
	 * 
	 */
	public boolean delete(User user) {
		boolean success = false;
		if (null == user) {
			return success;
		}

		try {
			userRepository.delete(user);
			success = true;
		} catch (Exception e) {
			success = false;
		}
		return success;
	}
	/*
	 * This method should be used to list all users. Call the corresponding method of Respository interface.
	 * 
	 */
	public List<User> list() {
		return (List<User>) userRepository.findAll();
		}
	/*
	 * This method should be used to validate a user using password. Call the corresponding method of Respository interface.
	 * 
	 */
	public boolean validate(String username, String password) {
		boolean success = false;
		if (null == username || null == password) {
			return success;
		}
		try {
			User user = userRepository.validate(username, password);
			if(null != user) {
				return true;
			}
			success = false;
		} catch (Exception e) {
			success = false;
		}

		return success;
	}
	/*
	 * This method should be used to get a user by username. Call the corresponding method of Respository interface.
	 */
	public User get(String username) {
		User user = null;
		if(null == username) {
			return null;
		}
		try {
			user = userRepository.findOne(username);
		} catch (Exception e) {
			return null;
		}
		return user; 
	}
	/*
	 * This method is used to check whether a user with a specific username exists. Call the corresponding method of Respository interface.
	 */
	public boolean exists(String username) {
		boolean success = false;
		if (null == username) {
			return success;
		}
		try {

			success = userRepository.exists(username);
		} catch (Exception e) {
			return success;
		}
		return success;
	}
}
