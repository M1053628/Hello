package com.mindtree.transactionnJMS;

import javax.jms.ConnectionFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;


@EnableJms
@ComponentScan(basePackages= {"com.mindtree.transactionnJMS.controller","com.mindtree.transactionnJMS.service"})
@SpringBootApplication
public class TransactionnJmsApplication {

	@Bean
	public JmsListenerContainerFactory<?> myFactory(ConnectionFactory connectionFactory,
	DefaultJmsListenerContainerFactoryConfigurer configurer) {
DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
configurer.configure(factory, connectionFactory);
return factory;
}
	public static void main(String[] args) {
		SpringApplication.run(TransactionnJmsApplication.class, args);
	}

}

