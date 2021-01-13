package by.makarevich.Alla.s_wish_list;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootTest
class ApplicationTests {
	{
		ApiContextInitializer.init();
	}
	@Test
	void contextLoads() {
	}

}
