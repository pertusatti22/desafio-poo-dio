package br.com.dio.desafio;

import br.com.dio.desafio.domain.Bootcamp;
import br.com.dio.desafio.domain.Course;
import br.com.dio.desafio.domain.Developer;
import br.com.dio.desafio.domain.Mentoring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

		Course course = new Course();
		Course course2 = new Course();
		Mentoring mentoring = new Mentoring();

		course.setTitle("Java Course");
		course.setDescription("Course Description sample");
		course.setWorkLoad(8);

		course2.setTitle("Springboot Course");
		course2.setDescription("Course Description sample");
		course2.setWorkLoad(12);

		System.out.println(course);
		System.out.println(course2);

		mentoring.setTitle("Prime Mentoring");
		mentoring.setDescription("Mentoring Description sample");
		mentoring.setDate(LocalDate.now());

		System.out.println(mentoring);

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("Java and Spring Developer Bootcamp");
		bootcamp.setDescription("Bootcamp description Sample");
		bootcamp.getContents().add(course);
		bootcamp.getContents().add(course2);
		bootcamp.getContents().add(mentoring);

		Developer jackson = new Developer();
		jackson.setName("Jackson");
		jackson.subscribeBootcamp(bootcamp);
		System.out.println(jackson.getSubscribedContents());
		jackson.goFoward();
		System.out.println(jackson.getDoneContents());
		jackson.goFoward();
		System.out.println(jackson.getDoneContents());
		System.out.println(jackson.xpTotalCalculate());

		Developer jhony = new Developer();
		jhony.setName("Jhony");
		jhony.subscribeBootcamp(bootcamp);
		System.out.println(jhony.getSubscribedContents());
		jhony.goFoward();
		System.out.println(jhony.getDoneContents());
		System.out.println(jhony.xpTotalCalculate());

	}

}
