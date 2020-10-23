#!/usr/bin/env bash
file="phone-num"

#luckNum=$[RANDOM%50+1]
wc -l ${file}
echo "$(wc -l ${file} |cut -d ' ' -f 2)"

#echo ${line}
#echo ${luckNum}

#echo ${luckNum} >> luck.txt

#sed -i "/$luckNum/d" ${file}

