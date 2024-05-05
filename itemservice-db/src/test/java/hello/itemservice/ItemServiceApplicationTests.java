package hello.itemservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
//SpringBootTest가 있으면 main에 있는 @SpringBootApplication을 찾는다.
// @SpringBootApplication이 붙은 곳의 설정(@Import등)을 사용해서 test한다.
class ItemServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
