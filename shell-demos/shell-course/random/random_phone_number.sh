#!/usr/bin/env bash

file="phone-num"
for (( i = 0; i < 50; ++i )); do
    phoneNum=181
    for (( j = 0; j < 8; ++j )); do
           phoneNum=${phoneNum}$[RANDOM%10]
    done
    echo ${phoneNum}>>${file}
done
