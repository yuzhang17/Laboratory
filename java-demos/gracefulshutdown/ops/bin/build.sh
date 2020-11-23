#!/usr/bin/env bash

gradle build

docker build -f "ops/docker/Dockerfile" . -t "graceful-shutdown-no-sleep"