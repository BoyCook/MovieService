#!/bin/sh

rm run.pid
mvn clean package
nohup java -Xmx128m -jar target/movie-service.jar --server.port=5000 > /dev/null 2>&1 & echo $! > run.pid
mvn verify
kill -9 `cat run.pid`
