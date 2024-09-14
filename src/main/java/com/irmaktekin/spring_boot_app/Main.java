package com.irmaktekin.spring_boot_app;

import com.irmaktekin.spring_boot_app.dao.StudentDao;
import com.irmaktekin.spring_boot_app.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao){
		return runner -> {
			//createStudent(studentDao);
			getStudentInfo(studentDao);
		};
	}
	//create student
	private void createStudent(StudentDao studentDao){
		System.out.println("Creating new student object...");
		Student student = new Student("Irmak","Tekin","test@test.com");
		System.out.println("Saving the student");
		studentDao.save(student);
		System.out.println("Saved student. Generated ID: " + student.getId());
	}
	private void getStudentInfo(StudentDao studentDao){
		System.out.println("Creating new student object...");
		Student student = new Student("Dilan","Tekin","test@test.com");
		System.out.println("Saving the student");
		studentDao.save(student);
		System.out.println("Getting the student...");
		int id = student.getId();
		System.out.println("ID:" + student.getId());
	}
}
