[![Build Status](https://travis-ci.org/BoyCook/MovieService.png?branch=master)](https://travis-ci.org/BoyCook/MovieService)
[![Coverage Status](https://coveralls.io/repos/github/BoyCook/MovieService/badge.svg?branch=master)](https://coveralls.io/github/BoyCook/MovieService?branch=master)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/1e59fab65fed4438be24c2b15d1638f0)](https://www.codacy.com/app/BoyCook/MovieService?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=BoyCook/MovieService&amp;utm_campaign=Badge_Grade)
[![Dependency Status](https://www.versioneye.com/user/projects/59adc4390fb24f0032e40a49/badge.svg?style=flat-square)](https://www.versioneye.com/user/projects/59adc4390fb24f0032e40a49)

### Description

A simple movie catalogue service used for developer training

* Test: http://movie-service-test.eu-west-2.elasticbeanstalk.com
* Prod: http://movie-service.eu-west-2.elasticbeanstalk.com

### Running

Spring Boot

    java -jar target/movie-service.jar --server.port=5000

Build and run

    mvn clean package && java -jar target/movie-service.jar --server.port=5000

### Building

Tests

    mvn clean test

Coverage

    mvn clean cobertura:cobertura
    
Publish artifact
 
    mvn -s .travis.settings.xml clean deploy

### References

* https://aws.amazon.com/blogs/devops/deploying-a-spring-boot-application-on-aws-using-aws-elastic-beanstalk/
* https://docs.travis-ci.com/user/deployment/elasticbeanstalk/#Environment-variables
* https://console.aws.amazon.com/iam/home?#/security_credential
* https://github.com/metaeducation/ren-c/wiki/Create-Travis-s3-Deployment-Credentials
* https://renzo.lucioni.xyz/s3-deployment-with-travis/
* https://docs.travis-ci.com/user/build-stages/
* https://github.com/cfpb/jmeter-bootstrap
* https://spring.io/guides/gs/securing-web/
* https://spring.io/guides/gs/accessing-data-rest/
* https://spring.io/guides/gs/accessing-data-mysql/
