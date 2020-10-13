#!/usr/bin/env bash

test 1 = 2; echo $?

test 1 = 1; echo $?

[ 1 = 2 ]; echo $?

[[ 1 = 2 ]]; echo $?


(( 1 == 2 )); echo $?




