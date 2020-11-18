#!/usr/bin/env bash
FROM mcr.microsoft.com/java/jre:13-zulu-alpine

COPY build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]