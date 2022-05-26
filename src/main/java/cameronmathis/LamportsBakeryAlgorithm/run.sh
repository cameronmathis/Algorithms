#!/usr/bin/env bash
export JAVA_PROGRAM_ARGS=`echo "$@"`
mvn -q exec:java -Dexec.mainClass="cameronmathis.LambertsBakeryAlgorithm.Main" -Dexec.args="$JAVA_PROGRAM_ARGS" -f ../../../../../pom.xml