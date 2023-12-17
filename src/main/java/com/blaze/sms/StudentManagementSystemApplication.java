package com.blaze.sms;

import com.blaze.sms.entity.Student;
import com.blaze.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StudentManagementSystemApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}


	@Autowired
		private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		Student emmy = new Student("Emmanuel","Ademola","emmyboy21@gmail.com");
		Student sammie = new Student("Samuel", "Ademola","Sammu@yahoo.com");
		Student ronaldo = new Student("Ronaldo", "Cristiano","ronaldo@yahoo.com");
		Student glory = new Student("Glory", "Olawepo","Glory@yahoo.com");
		Student toyo = new Student("Toyosi", "Oyelayo","toyo@yahoo.com");
		Student emma = new Student("Emma", "Kayode","emmy@yahoo.com");
		Student ginger = new Student("Alberto", "Ayeni","alby@yahoo.com");

		studentRepository.saveAll(List.of(emmy,sammie,ronaldo,glory,toyo,emma,ginger));

		}
}
