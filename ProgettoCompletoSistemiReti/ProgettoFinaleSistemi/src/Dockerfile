FROM openjdk:21.0.2-jdk-slim

COPY ./out/artifacts/ProgettoFinale_main_jar/ProgettoFinale_main.jar /app/ProgettoFinale_main.jar
COPY ./ProgettoFinaleSistemi/src/Regione-Lombardia---Mappa-delle-strutture-ricettive.csv /app/ProgettoFinaleSistemi/src/Regione-Lombardia---Mappa-delle-strutture-ricettive.csv

WORKDIR /app

EXPOSE 1050

CMD ["java", "jar", "ProgettoFinale_main.jar"]