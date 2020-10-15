# Docker descriptor for Dirigible
# License - http://www.eclipse.org/legal/epl-v10.html
 
FROM tomcat:8.5.43-jdk11-openjdk
 
RUN rm -R /usr/local/tomcat/webapps/*
COPY engine/xsk/application/target/ROOT.war $CATALINA_HOME/webapps/
RUN rm /usr/local/tomcat/conf/tomcat-users.xml
COPY engine/xsk/application/tomcat-users.xml $CATALINA_HOME/conf/
RUN wget https://jdbc.postgresql.org/download/postgresql-42.1.4.jar -P /usr/local/tomcat/lib/
 
EXPOSE 8080
CMD ["catalina.sh", "run"]