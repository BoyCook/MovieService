[![Build Status](https://travis-ci.org/BoyCook/MovieService.png?branch=master)](https://travis-ci.org/BoyCook/MovieService)
[![Coverage Status](https://coveralls.io/repos/github/BoyCook/MovieService/badge.svg?branch=master)](https://coveralls.io/github/BoyCook/MovieService?branch=master)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/1e59fab65fed4438be24c2b15d1638f0)](https://www.codacy.com/app/BoyCook/MovieService?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=BoyCook/MovieService&amp;utm_campaign=Badge_Grade)

### DESCRIPTION

A simple movie catalogue service, for use on the developer training day

http://movie-service.eu-west-2.elasticbeanstalk.com

### Running

Spring Boot

    java -jar target/movie-service.jar

Build and run

    mvn clean package && java -jar target/movie-service.jar

### Building

Tests

    mvn clean test

Coverage

    mvn clean cobertura:cobertura

### References

* https://aws.amazon.com/blogs/devops/deploying-a-spring-boot-application-on-aws-using-aws-elastic-beanstalk/
* https://docs.travis-ci.com/user/deployment/elasticbeanstalk/#Environment-variables
* https://console.aws.amazon.com/iam/home?#/security_credential
* https://github.com/metaeducation/ren-c/wiki/Create-Travis-s3-Deployment-Credentials
* https://renzo.lucioni.xyz/s3-deployment-with-travis/
