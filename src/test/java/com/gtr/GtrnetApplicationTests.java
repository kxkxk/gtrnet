package com.gtr;

import com.gtr.Mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GtrnetApplicationTests {

	@Autowired
	UserMapper mapper;

	@Test
	void contextLoads() {
		System.out.println("。。。。。。。"+mapper.findAll());
	}

}
