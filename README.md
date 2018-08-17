# eurekafargatesample
When you run eureka clients on AWS Fargate the registration does not work by default. That's because the IP which is used in registration is wrong. You should use Fargate metadata to get the correct IP and use that when registering to eureka. This is a sample which shows how to do it.



How to try this?
I assume that you have Eureka server running on AWS.
- define Eureka server ip and credentials in application-fargate.yml file
- build the artifact
	mvn package
- create docker image
	docker build -t eurekafargatesample .
- Login to AWS ECR and create new repository
- Click "View push commands" to get commands you need to be able to push to ECR. Login and push docker image to ECR.
- Create new Task definition on AWS for fargate task. Ensure that as a container name you put a name which is consistent with CloudConfiguration.java (DOCKER_CONTAINER_NAME). Add SPRING_PROFILES_ACTIVE environment variable and as a value give "fargate". By default ports are 8888.
- Create ECS cluster and a service with new task definition