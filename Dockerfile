# extend base ubuntu
FROM tomcat:9.0-jdk8-openjdk

MAINTAINER Aman Bansal, https://github.com/aman-bansal


# Define commonly used JAVA_HOME variable
#ENV JAVA_HOME /usr/lib/jvm/java-8-oracle

ENV JAVA_OPTS="-Dgwt.extraJvmArgs=-Xms512m -Xmx512m -XX:+UseG1GC"
# ensure installation
RUN java -version

# install application
ARG port="80"
ENV PORT=$port
EXPOSE $PORT
EXPOSE 8080

VOLUME /logs

RUN mkdir /app
COPY ./target /app/target
WORKDIR /app
RUN ls

RUN ls /usr/local

RUN rm -rf /usr/local/tomcat/webapps/*

RUN rm /usr/local/tomcat/conf/tomcat-users.xml
COPY tomcat-users.xml /usr/local/tomcat/conf
COPY ./target/sampleJavaApplication.war /usr/local/tomcat/webapps/ROOT.war

COPY docker-entrypoint.sh /docker-entrypoint.sh

RUN chmod +x /docker-entrypoint.sh

ENTRYPOINT ["/docker-entrypoint.sh"]
