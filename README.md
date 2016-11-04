# Spring Cloud Tutorial

Source code for Spring Cloud Tutorial

Author:

Dimitri De Franciscis  
http://www.megadix.it

# Architecture

The project consists of multiple modules or services, each leveraging one or more features of [Spring Cloud](http://projects.spring.io/spring-cloud/).

![Architecture](doc/assets/architecture.png)


## config-server

This services manages the configuration of all the services.

## discovery-service

This service keeps track of all the available service instances. Each services, upon startup, registers itself onto `discovery-service` so other components can find it.

## gateway-service

This service acts as a reverse proxy to all the registered services. The list of available services is read from `discovery-service`, each discovered service is exposed through a sub-path, e.g. `greeting-service` will be mapped under `/greeting-service` path.

## greeting-service

An example of an actual business service (the classic "Hello World" example).
