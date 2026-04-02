package example.middle.lecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LectureApplication {

	public static void main(String[] args) {
		SpringApplication.run(LectureApplication.class, args);
		System.out.println("시작됨");
	}

}
