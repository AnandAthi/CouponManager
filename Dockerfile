FROM alpine:3.8
FROM openjdk:11-jre-slim
RUN mkdir /app
WORKDIR /app
COPY ./build/libs/CouponManager-0.0.1-SNAPSHOT.jar /app
CMD ["java","-jar", "CouponManager-0.0.1-SNAPSHOT.jar"]