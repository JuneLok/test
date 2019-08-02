# monitor docker配置
FROM frolvlad/alpine-oraclejdk8

MAINTAINER TuMinglong (tuminglong@126.com)

VOLUME /tmp

ENV PROJECT_HOME /home/project
ENV TOMCAT_HOME /home/tomcat/webapps
ENV OUTPUT_HOME /output

RUN mkdir -p "$PROJECT_HOME" && mkdir -p "$OUTPUT_HOME" && mkdir -p "$TOMCAT_HOME"

ADD monitor.jar /home/project/monitor.jar

WORKDIR /home/project

# 指定容器内的时区
RUN echo "Asia/Shanghai" > /etc/timezone

RUN sh -c 'touch  /monitor.jar'

ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /home/project/monitor.jar" ]

EXPOSE 8180

# docker run -it -d --name monitor -p8180:8180 -v /output:/output monitor:v1
