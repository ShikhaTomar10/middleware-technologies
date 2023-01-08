# middleware-technologies

#endpoints
http://localhost:8080/subjects    -GET method,PUT method,
http://localhost:8080/subjects/{id}  -POST method, DELETE method

#docker yml file 
docker-compose up

#some docker commands

docker network create web-application-sql-network

docker run --detach --env MYSQL_ROOT_PASSWORD=password 
--env MYSQL_USER=userdb --env MYSQL_PASSWORD=password --env MYSQL_DATABASE=userdb 
--name mysql --publish 3306:3306 --network=web-application-sql-network mysql:5.7

docker build -t hftbackendapp:dockerfile .

docker start

docker logs -f

docker container run -p 8080:8080 --network=web-application-sql-network 
-e RDS_HOSTNAME=mysql  hftbackendapp:dockerfile


docker network inspect web-application-sql-network

docker-compose up

docker login

