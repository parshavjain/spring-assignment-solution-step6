package com.stackroute.activitystream.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.activitystream.model.Circle;
import com.stackroute.activitystream.model.UserCircle;
import com.stackroute.activitystream.repository.CircleRepository;
import com.stackroute.activitystream.repository.UserCircleRepository;
import com.stackroute.activitystream.repository.UserRepository;
/*
* Service classes are used here to implement additional business logic/validation.
* This class has to be annotated with @Service annotation.
* @Service - It is a specialization of the component annotation. It doesn�t currently 
* provide any additional behavior over the @Component annotation, but it�s a good idea 
* to use @Service over @Component in service-layer classes because it specifies intent 
* better. Additionally, tool support and additional behavior might rely on it in the 
* future.
* */
@Service
public class UserCircleServiceImpl implements UserCircleService{

	/*
	 * Autowiring should be implemented for the UserCircleRepository.
	 *  Please note that we should not create any object using the new keyword
	 * */
	@Autowired
	UserCircleRepository userCircleRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	CircleRepository circleRepository;
	
	/*
	 * This method should be used to add a user to a specific circle. You need to validate
	 * whether the user and also the circle exist. Also, please check if the user is already
	 * added to the circle. Call the corresponding method of Respository interface.
	 * 
	 */
	public boolean addUser(String userName, String circleName) {
		try {
			if (null != userName) {
				if (!userRepository.exists(userName)) {
					return false;
				}
			}

			if (null != circleName) {
				Circle circle = circleRepository.findOne(circleName);
				if (null == circle) {
					return false;
				}
			}
			
			UserCircle userCircleExist = userCircleRepository.getUsernameAndCircleName(userName, circleName);
			
			if(null != userCircleExist) {
				return false;
			}

			UserCircle userCircle = new UserCircle(userName, circleName);
			userCircleRepository.save(userCircle);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	/*
	 * This method should be used to remove a user from a specific circle. Please check 
	 * if the user is added to the circle before trying to remove. Call the corresponding method of Respository interface.
	 * 
	 */
	public boolean removeUser(String username, String circleName) {
		try {
			if (null != username) {
				if (!userRepository.exists(username)) {
					return false;
				}
				Circle circle = circleRepository.findOne(circleName);
				if (null == circle) {
					return false;
				}
				UserCircle userCircle = new UserCircle(username, circleName);
				userCircleRepository.delete(userCircle);
				return true;
			}

		} catch (Exception e) {
			return false;
		}
		return false;
	}
	
	
	/*
	 * This method should be used to show circles subscribed by a specific user. Call the corresponding method of Respository interface.
	 * 
	 */
	public List<String> getMyCircles(String userName){
		List<String> userCircleList = null;
		try {
			if (null != userName) {
				if (!userRepository.exists(userName)) {
					return userCircleList;
				}
			}
			List<String> circleList = (List<String>) userCircleRepository.findCircleNameByUserName(userName);
			Set<String> set = new HashSet<String>(circleList);
			userCircleList = new ArrayList<String>();
			userCircleList.addAll(set);
		} catch (Exception ex) {
			return userCircleList;
		}
		return userCircleList;
	}
	
	/*
	 * This method should be used to check whether a specific user has subscribed to a 
	 * specific circle. Call the corresponding method of Respository interface.
	 * 
	 */
	public UserCircle get(String userName, String circleName) {
		UserCircle userCircle = null;
		try {
			if (null != userName && null != circleName && !userName.isEmpty() && !circleName.isEmpty()) {

				userCircle = (UserCircle) userCircleRepository.getUsernameAndCircleName(userName, circleName);
			}
		} catch (Exception ex) {
			return userCircle;
		}
		return userCircle;
	}
}
