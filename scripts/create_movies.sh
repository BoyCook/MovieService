#!/usr/bin/env bash

COOKIE=4AA3CB0581E776461A159EE0A88CF677

curl -i -X POST -H "Content-Type:application/json" -d "{  \"name\" : \"Star Wars I\",  \"description\" : \"The Phantom Menace\" }" http://localhost:5000/api/movies
curl -i -X POST -H "Content-Type:application/json" -d "{  \"name\" : \"Star Wars II\",  \"description\" : \"Attack of the Clone\" }" http://localhost:5000/api/movies
curl -i -X POST -H "Content-Type:application/json" -d "{  \"name\" : \"Star Wars III\",  \"description\" : \"Revenge of the Sith\" }" http://localhost:5000/api/movies
curl -i -X POST -H "Content-Type:application/json" -d "{  \"name\" : \"Star Wars IV\",  \"description\" : \"A New Hope\" }" http://localhost:5000/api/movies
curl -i -X POST -H "Content-Type:application/json" -d "{  \"name\" : \"Star Wars V\",  \"description\" : \"The Empire Strikes Back\" }" http://localhost:5000/api/movies
curl -i -X POST -H "Content-Type:application/json" -d "{  \"name\" : \"Star Wars VI\",  \"description\" : \"Return of the Jedi\" }" http://localhost:5000/api/movies
