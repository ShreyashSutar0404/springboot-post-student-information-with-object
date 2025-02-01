package org.dnyanyog.controller;

import org.dnyanyog.dto.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class StudentController {
	
	@GetMapping(path="/studentInfo", produces={"application/xml","application/json",}) //here after produces if you write {"application.json"} it will return your object in json format 
	public Students std() {											// if you write application/xml it will return your object in xml format.
		Students std = new Students();
		std.firstName = "Shreyash";
		std.lastName = "Sutar";
		std.email = "shreyashsutar124@gmail.com";
		std.mobileNumber = "8485898732";
		std.age = 21;
		return std;
	}
	
	@PostMapping(path= "/studentInfo", produces={"application/xml","application/json"}, consumes={"application/xml","application/json"} )
	public String saveStudentData(@RequestBody Students student) {
		System.out.println(student.firstName);
		System.out.println(student.lastName);
		System.out.println(student.email);
		System.out.println(student.mobileNumber);
		System.out.println(student.age);
		
		return"Data Saved!";
	}
}
