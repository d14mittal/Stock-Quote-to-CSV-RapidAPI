FROM openjdk:8-alpine
COPY target/Stock*.jar /usr/local/app/stock-quote/lib/Stock-Quote.jar
ENTRYPOINT ["java","-jar","/usr/local/app/stock-quote/lib/Stock-Quote.jar"]