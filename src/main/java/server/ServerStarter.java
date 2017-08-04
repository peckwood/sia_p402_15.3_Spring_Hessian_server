package server;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import server.config.RootConfig;

public class ServerStarter {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		System.out.println("Server started");
	}
}
