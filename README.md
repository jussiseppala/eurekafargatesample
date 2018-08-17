# eurekafargatesample
When you run eureka clients on AWS Fargate the registration does not work by default. That's because the IP which is used in registration is wrong. You should use Fargate metadata to get the correct IP and use that when registering to eureka. This is a sample which shows how to do it.
