create database movie_service; -- Create the new database
create user 'movieservice'@'localhost' identified by 'password'; -- Creates the user
grant all on movie_service.* to 'movieservice'@'localhost'; -- Gives all the privileges to the new user on the newly created database
