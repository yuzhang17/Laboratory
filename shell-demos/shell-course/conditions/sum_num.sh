#!/usr/bin/env bash

result=0
for(( i = 1; i<100; i = i+2))
    do
    result=$[result + i]
    done
echo ${result}

result=0
for i in {1..100..2}
    do
    result=$((result + i))
    done
echo ${result}


result=0
for i in $(seq 1 100)
    do
    if [[ $[i % 2] -eq 1 ]]
        then
        let result=$i+$result
    fi
    done
echo ${result}


result=0
for i in {1..100}
    do
    [[ $[i%2] -eq 1 ]] && let result=$result+$i
    done
echo ${result}