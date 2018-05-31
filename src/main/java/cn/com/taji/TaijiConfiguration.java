package cn.com.taji;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import cn.com.taji.bean.FooProperties;

@Configuration
@EnableConfigurationProperties(FooProperties.class)
public class TaijiConfiguration {
	@Autowired
	private FooProperties fooProperties;
	
	
	
	public String toString() {
		return fooProperties.toString();
		
	}
}
