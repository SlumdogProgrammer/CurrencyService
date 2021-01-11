FROM  openjdk:11

RUN mkdir usr/src/app
COPY ./build/libs/currencyservice-0.0.1-SNAPSHOT.jar usr/src/app

EXPOSE 8080

CMD java -jar usr/src/app/currencyservice-0.0.1-SNAPSHOT.jar