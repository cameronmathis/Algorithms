#!/usr/bin/env bash
export JAVA_PROGRAM_ARGS=`echo "$@"`
mvn -q exec:java -Dexec.mainClass="cameronmathis.SortingAlgorithms.HeapSort.Main" -Dexec.args="$JAVA_PROGRAM_ARGS" -f ../../../../../../pom.xml