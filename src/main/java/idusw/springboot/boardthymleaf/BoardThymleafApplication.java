package idusw.springboot.boardthymleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication//(exclude = DataSourceAutoConfiguration.class)
public class BoardThymleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoardThymleafApplication.class, args);
    }

}
