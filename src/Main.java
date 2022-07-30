import br.com.dio.desafio.domain.Course;
import br.com.dio.desafio.domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Mentoring mentoring = new Mentoring();

        course.setTitle("Java Course");
        course.setDescription("Description sample");
        course.setWorkLoad(8);

        System.out.println(course);

        mentoring.setTitle("Prime Mentoring");
        mentoring.setDescription("Description sample");
        mentoring.setDate(LocalDate.now());

        System.out.println(mentoring);
    }
}
