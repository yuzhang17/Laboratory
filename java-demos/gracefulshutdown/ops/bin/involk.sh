#!/bin/bash

echo start $(date +%s)
for (( VAR = 0; VAR < 1000; ++VAR )); do
    response=$(curl -i http://192.168.64.5:30009/hello 2> /dev/null)
    http_status=$(echo "${response}" | awk 'NR==1' | cut -d ' ' -f2)
    if [[ ${http_status} -ne 200 ]];then
        echo "${response}"
     fi
done


echo end $(date +%s)

