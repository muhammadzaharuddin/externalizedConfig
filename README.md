Mission 6 - Externalized Config (*.properties)								
Recommended Duration								
0.5 to 1.0 day(s)								
								
Prerequisites								
1. Completed Mission 5								
2. Basic Understanding of Externalized Configurations								
								
What you need to do								
1. Create profiles for `test` and `prod` environment								
2. Modify your Mission 1 API to print message based on environment profiles, i.e. ""Hello World, <message>"". You should use @Value to retrieve `message` value from application.<env>.properties.
E.g.
- `test` profiles output: ""Hello World, TEST!""
- `prod` profiles output: ""Hello World, PROD!"""								
3. Run your application, verify the Mission 1 endpoints using Postman using different active profiles.								
4. Check in your source code in your GitHub repo.								
								
Extra								
Try Spring Cloud Config by referring to step-by-step in https://spring.io/guides/gs/centralized-configuration/								
								
Resources								
1. SpringBoot Externalized Configuration, https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-external-config								
2. Profile based properties and yaml example, https://mkyong.com/spring-boot/spring-boot-profile-based-properties-and-yaml-example/								
