package by.makarevich.Alla.s_wish_list;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApiContextInitializer.init();
		SpringApplication.run(Application.class, args);
	}

}
