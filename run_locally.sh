#!/usr/bin/env bash

#this is for mac based systems

mvn package -DskipTests

rm -rf /usr/local/Cellar/tomcat/9.0.37/libexec/webapps/*
rm /usr/local/Cellar/tomcat/9.0.37/libexec/conf/tomcat-users.xml
cp tomcat-users.xml /usr/local/Cellar/tomcat/9.0.37/libexec/conf
cp ./target/sampleJavaApplication.war /usr/local/Cellar/tomcat/9.0.37/libexec/webapps/ROOT.war

/usr/local/Cellar/tomcat/9.0.37/bin/catalina run