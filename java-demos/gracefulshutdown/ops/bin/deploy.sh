#!/usr/bin/env bash

kubectl apply -f ops/k8s/graceful-shutdown-test-exit-graceful-10s.yaml
kubectl apply -f ops/k8s/graceful-shutdown-test-exit-immediate.yaml
kubectl apply -f ops/k8s/graceful-shutdown-test-exit-graceful-30s.yaml
kubectl apply -f ops/k8s/graceful-shutdown-no-sleep.yaml