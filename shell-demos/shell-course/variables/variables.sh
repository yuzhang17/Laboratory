#!/usr/bin/env bash

A=/root/Desktop/shell/mem.txt
echo ${A}

dirname ${A}

basename ${A}


url=www.taobao.com

echo ${#url}
echo ${url#*.}
echo ${url##*.}

echo ${url%.*}
echo ${url%%.*}

#替换
echo ${url/ao/AO}
#贪婪替换
echo ${url//ao/AO}

echo ${abc-123}
abc=hello
echo ${abc-123}
abc=
echo ${abc-123}
echo "======="
echo ${abc:-123}
abc=hello
echo ${abc:-123}
abc=""
echo ${abc:-123}
