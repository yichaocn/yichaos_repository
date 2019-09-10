
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
* 张汝超
* 2019-9-9 16:16:32
*
* */
@SpringBootApplication
@EnableDubboConfiguration
public class JavaBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBaseApplication.class, args);
	}

}
