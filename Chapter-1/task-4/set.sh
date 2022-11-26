#!/bin/bash

#SET

#Insert
echo "Insert Set"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 SADD liuSet hello liu xu
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 SADD liuSet1 Hi test1 pass

#Length
echo "Length Set"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 SCARD liuSet
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 SCARD liuSet1

#Members
echo "Members Set"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 SMEMBERS liuSet
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 SMEMBERS liuSet1

#Pop
echo "Pop Hash"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 SPOP liuSet 1

#Members
echo "Members Set"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 SMEMBERS liuSet

#Del
echo "Delete Set"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 DEL liuSet
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 DEL liuSet1
