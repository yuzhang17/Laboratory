#!/usr/local/bin/bash

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


##变量没有被赋值：会使用“新的变量值“ 替代
#变量有被赋值（包括空值）： 不会被替代

echo ${abc-123}
abc=hello
echo ${abc-123}
abc=
echo ${abc-123}
echo "======="
#${变量名:-新的变量值} 或者 ${变量名:=新的变量值}
#变量没有被赋值或者赋空值：会使用“新的变量值“ 替代
#变量有被赋值： 不会被替代
unset abc
echo ${abc:-123}
abc=hello
echo ${abc:-123}
abc=
echo ${abc:-123}
echo "======="

#
#${变量名+新的变量值}
#变量没有被赋值或者赋空值：不会使用“新的变量值“ 替代
#变量有被赋值： 会被替代
 unset abc
 echo ${abc+123}
 abc=hello
 echo ${abc+123}
 abc=
 echo ${abc+123}
 echo "======="


#   ${变量名:+新的变量值}
#   变量没有被赋值：不会使用“新的变量值“ 替代
#   变量有被赋值（包括空值）： 会被替代
echo 变量名:+新的变量值
 unset abc
 echo ${abc:+123}

 abc=hello
 echo ${abc:+123}
 abc=
 echo ${abc:+123}
  echo "======="


#   ${变量名:?新的变量值}
#   变量没有被赋值或者赋空值时:提示错误信息
#   说明：?主要是当变量没有赋值提示错误信息的，没有赋值功能
unset abc
echo ${abc:?error}
echo ${abc:?error}
abc=
echo ${abc:?error}

#   ${变量名?新的变量值}
#   变量没有被赋值:提示错误信息
unset abc
echo ${abc?123}

abc=hello
echo ${abc?123}
abc=
echo ${abc?123}


