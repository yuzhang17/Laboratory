#!/usr/bin/env bash


echo 列表循环
for var in {1..10};
    do
        echo ${var}
    done


for var in 1 2 3 4 5 6 7 8 9 10;
    do
        echo ${var}
    done

echo "遍历输入参数"

for var1
    do
       echo ${var1}
    done


echo "类c风格循环"



echo "遍历数组"
declare -a array
array=(4 2 3 4)

for var in ${array[*]};
    do
        echo ${var}
    done