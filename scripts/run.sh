#!/bin/sh

mvn clean package && java -jar target/movie-service.jar --server.port=5000
