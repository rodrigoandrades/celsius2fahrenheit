package com.example.celsius2fahrenheit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class ApplicationTests {

	@Test
	public void cel2far() {
		//TemperatureConverter converter = new TemperatureConverter();
		//assertThat(converter.cel2far(43.0)).isEqualTo(109.4);
	}

}
