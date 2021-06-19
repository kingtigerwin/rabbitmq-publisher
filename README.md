# rabbitmq-publisher
This is the rabbitmq spring boot app used to send the message to the queue

## How to setup rabbitmq server ( docker version)
* Run the below command to start up rabbitmq server container in local
```
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management
```
* open a browser and hit the below url
```
http://localhost:15672
```
* enter user 'guest' and password 'guest' to login to the system
* go to the 'queue' tab and create a new queue named "Mobile"