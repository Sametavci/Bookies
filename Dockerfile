# Java 21 JDK içeren küçük boyutlu base image
FROM eclipse-temurin:21-jdk-alpine

# Uygulama dizini
WORKDIR /app

# JAR dosyasını kopyala (target dizininde build edilmiş olmalı)
COPY target/*.jar app.jar

# Uygulama başlatma komutu
ENTRYPOINT ["java", "-jar", "app.jar"]
