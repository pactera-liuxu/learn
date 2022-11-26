#!/bin/bash

#STRING

#Set
echo "Set String"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7002 SET liu xu
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 EXPIRE liu 100

#Get
echo "Get String"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7003 GET liu
redis-cli -a 123456 -c -h 172.16.231.146 -p 7004 TTL liu

#Incr
echo "Incr String"
#redis-cli -a 123456 -c -h 172.16.231.146 -p 7003 INCR liu

#Incrby
echo "Incrby String"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 INCR liuIncr
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 INCRBY liuIncr 2
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 INCR liuIncr

#EX
echo "EX String"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 SET liu_test liuxu EX 50 NX
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 GET liu_test
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 TTL liu_test
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 SET liu_test liuxu EX 50 XX
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 GET liu_test
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 TTL liu_test

#Delete
echo "Delete String"
redis-cli -a 123456 -c -h 172.16.231.146 -p 7002 DEL liu
redis-cli -a 123456 -c -h 172.16.231.146 -p 7002 DEL liu_test
# Delete lowercase
redis-cli -a 123456 -c -h 172.16.231.146 -p 7001 del liuIncr
