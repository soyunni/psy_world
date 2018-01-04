package com.psyworld.comm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({
		"classpath:/config/${spring.profiles.active:local}/application-${spring.profiles.active:local}.properties" })
public class PsyWorldApplication {
	
	private static final String DEFAULT_PROFILE = "local";
	private static final String SPRING_PROFILES = "spring.profiles.active";

	public static void main(String[] args) {
		initDefaultProfile(DEFAULT_PROFILE);
		SpringApplication.run(PsyWorldApplication.class, args);
	}

	private static void initDefaultProfile(String defaultProfile) {
		String currentProfile = System.getProperty(SPRING_PROFILES);

		if (currentProfile == null || currentProfile.isEmpty()) {
			System.setProperty(SPRING_PROFILES, defaultProfile);
		}
	}
}
