package xin.yiliya;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("xin.yiliya.dao")
public class ExperimentApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExperimentApplication.class, args);
	}
}
