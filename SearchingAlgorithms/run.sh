#!/bin/bash
# compile the program in Java
javac -d out *.java
# execute the program
java -cp out Main $1 $2