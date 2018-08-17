FROM openjdk:8-jre-alpine

ADD /target/*.jar /app.jar

EXPOSE 8888 5701/udp

	
ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
	SPRING_PROFILES_ACTIVE= \
	EUREKA_IP= \
    JAVA_OPTS=""

CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar","--application.eurekaip=${EUREKA_IP}","--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]