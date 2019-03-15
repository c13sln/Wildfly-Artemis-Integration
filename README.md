# Wildfly-Artemis-Integration
Exempel på en thorntail-server som producerar ett event i en Session Bean, och en Message Driven Bean som konsumerar eventet.
Fokus här ligger på thorntailkonfigurationen framförallt för att få MDB:n att kunna kommunicera med brokern.
Integration mellan Thorntail/Wildfly swarm och ActiveMQ Artemis broker.

## Problem
Det finns få exempel och dålig dokumentation. Dessutom är de exempel som finns föråldrade, detta exempel kommer säkerligen åldras snabbt även det.

## Teknik
Tekniken som kommer användas här involverar: Maven, ActiveMQ Artemis, Docker och Thorntail.

## Köra programmet

1. 
   Starta Artemis-brokern lokalt, genom **docker run -it  -e ARTEMIS_USERNAME=myuser -e ARTEMIS_PASSWORD=password --name activemq --rm   -    p 8161:8161   -p 61616:61616   vromero/activemq-artemis**. 
  1. 
     När brokern har tillåtits starta upp, kan man komma åt ett webbgränssnitt på *localhost:8161/console*. Här kan man övervaka händelser        och systemhälsa för brokern.
2. Bygg projektet: **mvn clean install**
3. Kör thorntail-servern: **mvn thorntail:run**

### Externa resurser

1. [Wildfly/Thorntail-dokumentation för project-defaults.yml](https://docs.thorntail.io/2.3.0.Final/)
