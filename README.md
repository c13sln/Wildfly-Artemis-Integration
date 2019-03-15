# Wildfly-Artemis-Integration
Exempel på en thorntail-server som producerar ett event i en Session Bean, och en Message Driven Bean som konsumerar eventet.
Fokus här ligger på thorntailkonfigurationen framförallt för att få MDB:n att kunna kommunicera med brokern.
Integration mellan Thorntail/Wildfly swarm och ActiveMQ Artemis broker.

## Problem
Det finns få exempel och dålig dokumentation. Dessutom är de exempel som finns föråldrade, detta exempel kommer säkerligen åldras snabbt även det.

## Teknik
Tekniken som kommer användas här involverar: Maven, ActiveMQ Artemis, Docker och Thorntail.
