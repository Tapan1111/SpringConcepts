package com.tapan.SpringBoot.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tapan.SpringBoot.dto.UserDTO;

@RestController
public class DispatcedController {

	private static List<UserDTO> userList = new ArrayList<UserDTO>();
	private static Integer userNumber = 1;

	static {
		userList.add(new UserDTO(userNumber++, "Tapan", "Behera", 9348709726l, 23, "Bhubaneshwar"));
		userList.add(new UserDTO(userNumber++, "Satrujit", "pani", 8748764387l, 23, "BBSR"));
		userList.add(new UserDTO(userNumber++, "Biswajit", "Sahoo", 6765423536l, 23, "Keonjhar"));
		userList.add(new UserDTO(userNumber++, "Rahul", "Bai", 9348709726l, 23, "Jajpur"));
		userList.add(new UserDTO(userNumber++, "Eleven", "Shelby", 9999999999l, 23, "Brimingham"));
	}

	@GetMapping("/helloWorld")
	public String helloController() {
		return " Nischay kar Vijayee Kar!!!.";
	}

	@GetMapping("/todayDate")
	public LocalDate todayDate() {
		return LocalDate.now();
	}

	@GetMapping("/getUser")
	public List<UserDTO> getUsers() {
		return userList;
	}

	@GetMapping("/findUser/{userId}")
	public UserDTO findUser(@PathVariable Integer userId) {
		return userList.stream().filter(user -> user.getUserId().equals(userId)).findFirst().get();

	}

	@PostMapping("/createUser")
	public List<UserDTO> createUser(@RequestBody UserDTO userDTO) {
		userDTO.setUserId(userNumber++);
		userList.add(userDTO);
		return userList;
	}

	@DeleteMapping("/deleteUser")
	public List<UserDTO> deleteUser(@RequestBody UserDTO userDto) {
		userList.removeIf(user -> user.getUserId().equals(userDto.getUserId()));
		return userList;
	}

}
