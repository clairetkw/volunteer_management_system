package com.ntu.sctp.group1;

import com.ntu.sctp.group1.entity.Volunteer;
import com.ntu.sctp.group1.repository.VolunteerRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Group1Application {

	@Autowired
	VolunteerRepository volunteerRepository;

	public static void main(String[] args) {
		SpringApplication.run(Group1Application.class, args);
	}

	@PostConstruct
	public void createVolunteer () {
		Volunteer person1 = new Volunteer();
		person1.setAge(30);
		person1.setName("jon");

		volunteerRepository.save(person1);
	}
}
