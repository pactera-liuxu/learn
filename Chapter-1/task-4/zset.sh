#!/bin/bash

#ZSET

#Add
echo "Add Zset"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 ZADD liuZset 80 liu 40 xu 60 sting

#Length
echo "Length Zset"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 zcard liuZset

#SB Score
echo "Score Zset"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 ZSCORE liuZset "liu"

#Zrange
echo "Zrange Zset"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 ZRANGE liuZset \(59 100 BYSCORE
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 ZRANGE liuZset 0 10
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 ZRANGE liuZset 0 10 REV

#Zrank
echo "Zrank Zset"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 ZRANK liuZset test1
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 ZRANK liuZset liu

#Del
echo "DEL Zset"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 DEL liuZset

