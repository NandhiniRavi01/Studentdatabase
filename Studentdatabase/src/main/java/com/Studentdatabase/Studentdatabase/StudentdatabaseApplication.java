package com.Studentdatabase.Studentdatabase;

import com.Studentdatabase.Studentdatabase.entity.Student;
import com.Studentdatabase.Studentdatabase.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//overide method of CommandLinerRunner
public class StudentdatabaseApplication implements CommandLineRunner
{

	public static void main(String[] args) {

		SpringApplication.run(StudentdatabaseApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {


		Student student1 = new Student(67,"Nandhu", "Ravi", "nandhini@gmail.com","CSE",+919812345678L);
		studentRepository.save(student1);

		Student student2 = new Student(68,"Ravi", "Palanivel", "ravi@gmail.com","EEE",+916334567809L);
		studentRepository.save(student2);

		Student student3 = new Student(69,"Saranya", "Ravi", "saranya@gmail.com","ECE", +919987654321L);
		studentRepository.save(student3);

		Student student4 = new Student(70,"Anuratha", "Muthu", "anuratha@gmail.com","Civil",+919254781890L);
		studentRepository.save(student4);
		Student student5 = new Student(71,"lakshmi", "Muthu", "lakshmi@gmail.com","EEE",+919843217890L);
		studentRepository.save(student5);




	}
}
