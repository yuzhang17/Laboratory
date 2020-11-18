#!/usr/bin/env bash

minikube cache add graceful-shutdown-test-exit-immediate:latest
minikube cache add graceful-shutdown-test-exit-graceful-30s :latest
minikube cache add graceful-shutdown-test-exit-graceful-10s:latest
minikube cache add graceful-shutdown-no-sleep:latest