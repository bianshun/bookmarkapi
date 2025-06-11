package uk.cn;

import org.springframework.boot.SpringApplication;

public class TestBookmarkapiApplication {

	public static void main(String[] args) {
		SpringApplication.from(BookmarkapiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
