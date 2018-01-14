package com.stackroute.activitystream.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.activitystream.model.Circle;
import com.stackroute.activitystream.model.User;
import com.stackroute.activitystream.repository.CircleRepository;
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
public class CircleServiceImpl implements CircleService {

	/*
	 * Autowiring should be implemented for the CircleRepository and UserRepository.
	 * Please note that we should not create any object using the new keyword
	 */
	@Autowired
	CircleRepository circleRepository;

	@Autowired
	UserRepository userRepository;

	/*
	 * A circle should only be created if the circle does not already exist or the
	 * creatorId is a valid username.
	 */
	public boolean save(Circle circle) {
		try {
			if (null == circle) {
				return false;
			}
			if (null != circle.getCreatorId()) {
				circle.setCreatorId(circle.getCreatorId().toLowerCase());
			}
			User user = userRepository.findOne(circle.getCreatorId());

			if (null != circle.getCircleName()) {
				Circle tempCircle = circleRepository.findOne(circle.getCircleName());
				if (null == tempCircle && null != user) {
					circleRepository.save(circle);
					return true;
				}
			}
		} catch (Exception e) {
			return false;
		}

		return false;
	}

	/*
	 * This method should return the list of existing circles
	 */
	public List<Circle> getAllCircles() {
		List<Circle> circles = new ArrayList<Circle>();
		circleRepository.findAll().forEach(circles :: add);
		return circles;
	}

	/*
	 * This method should return the list of existing circles which matches the
	 * search String
	 */
	public List<Circle> getAllCircles(String searchString) {
		List<Circle> circles = new ArrayList<Circle>();
		circleRepository.findAll().forEach(circles :: add);
		return circles;
	}

	/*
	 * This method should return a specific circle which matches the Circle Name
	 */
	public Circle get(String circleName) {
		Circle circle = null;
		try {
			circle = circleRepository.findOne(circleName);
		} catch (Exception e) {
			return circle;
		}

		return circle;
	}

	/*
	 * This method should delete a specific circle(if exists)
	 */
	public boolean delete(Circle circle) {
		try {
			if (null != circle) {
				Circle tempCircle = circleRepository.findOne(circle.getCircleName());
				if (null != tempCircle) {
					circleRepository.delete(circle);
					return true;
				}
			}
		} catch (Exception e) {
			return false;
		}
		return false;
	}

}
