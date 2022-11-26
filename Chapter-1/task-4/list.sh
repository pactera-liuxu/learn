#!/bin/bash

#LIST

#Insert
echo "Insert List"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 RPUSH liuList liuxu
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 RPUSH liuList liuxu1
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 LINSERT liuList BEFORE liuxu1 hello
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 LRANGE liuList 0 -1

#Length
echo "Length List"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7003 LLEN liuList

#Index
echo "Index List"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7003 LINDEX liuList 1
redis-cli -a 123456 -c -h 172.16.231.146 -p 7003 LINDEX liuList -1

#Remove
echo "Remove List"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 LREM liuList 0 liuxu
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 LRANGE liuList 0 -1

#Delete
echo "Delete List"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7002 DEL liuList
