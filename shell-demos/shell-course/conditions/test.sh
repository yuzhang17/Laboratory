#!/usr/bin/env bash
echo "条件判断的四种方式"
test 1 = 2; echo $?

test 1 = 1; echo $?

[ 1 = 2 ]; echo $?

[[ 1 -eq 2 ]]; echo $?


(( 1 > 2 )); echo $?

echo "判断文件存在"
test -e array1.sh; echo $?

echo "判断文件权限"

test -r array.sh; echo $?

echo "判断文件新旧"
test array.sh -nt test.sh; echo $?

echo "判断整数相等"

test 1 -eq 1; echo $?

echo "判断字符串"

test 1a = 1; echo $?


echo "多重&&条件判断"

test 1 -eq 1 -a 1 -ne 0; echo $?

test 1 -eq 1 && test 1 -ne 0; echo $?

echo "多重||条件判断"

test 1 -eq 1 -o 1 -ne 1; echo $?

test 1 -eq 1 || test 1 -ne 1; echo $?

a=1
${a}


