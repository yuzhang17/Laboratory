#!/usr/bin/env bash

read -p "请输入你要ping的主机IP" ip

ping -c1 ${ip} &> /dev/null


#[[ $? -eq 0 ]] && echo "当前主机和目标主机${ip}是互通的" || echo "当前主机和目标主机${ip}部署互通的"

if [[ $? -eq 0 ]];then
    echo "当前主机和目标主机${ip}是互通的"
else
    echo "当前主机和目标主机${ip}不是互通的"
fi
