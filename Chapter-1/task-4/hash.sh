#!/bin/bash

#HASH

#Insert
echo "Insert Hash"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 HSET liuHash liu1 value1 liu2 value2 liu3 value3

#Length
echo "Length Hash"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 LLEN liuHash

#Key
echo "Key Hash"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 HKEYS liuHash

#Exist
echo "Exist Hash"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 HEXISTS liuHash liu1 
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 HEXISTS liuHash liuxu

#Get
echo "Get List"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 HGET liuHash liu1

#Del
echo "Del List"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 DEL liuHash
