#!/usr/bin/env bash
echo "普通数组定义"

declare -a array0
array0[0]=1
array0[1]=2

array1=(1 2 3 4)

echo ${array0[0]}
echo ${array1[0]}

echo "all element in array: ${array1[*]}"
echo "Length of array: ${#array1[*]}"
echo "Indexes of array: ${!array1[@]}"
echo "element from index 1 to 2: ${array1[@]:1:2}"

echo "关联数组定义"

declare -A array2

array2=(["name1"]="harry" ["name2"]="jack" ["name3"]="amy" )


echo "all element in array: ${array2[*]}"
echo "Length of array: ${#array2[*]}"
echo "Indexes of array: ${!array2[@]}"
echo "element from index 1 to 2: ${array2[@]:0:1}"




