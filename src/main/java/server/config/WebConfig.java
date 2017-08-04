package server.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

public class WebConfig extends WebMvcConfigurerAdapter {

	@Bean
	public HandlerMapping httpInvokerMapping(){
		SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
		Properties mappings = new Properties();
		mappings.setProperty("/calculator.service", "exportedCalculatorService");
		mapping.setMappings(mappings);
		return mapping;
	}
}