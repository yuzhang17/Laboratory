#!/bin/bash

stock_list () {
    local L=$1
    local M=$2
    declare -A list

    declare -A result
    list=${L} | tr "," " "

    for(( i=0;i<${#list[*]};i=i+2 ))
    do
         local cur_val=${list[i+1]}
         local cur_code=${list[i]}
         lcoal pre_res=${result[cur_code]}
         result[${cur_code}=$(( ${pre_res}+${cur_val}))
    done
    echo ${result}


}
stock_list "$1" "$2"