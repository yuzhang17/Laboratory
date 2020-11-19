#!/usr/bin/env bash

gradle build

docker build -f "ops/docker/Dockerfile" . -t "graceful-shutdown-test-exit-graceful-30s-with-prehook:latest"