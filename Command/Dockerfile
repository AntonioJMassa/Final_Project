# Use an official Java runtime as a parent image
FROM openjdk:11-jdk-slim

# Set the working directory to /app
WORKDIR /Command

# Copy the current directory contents into the container at /app
COPY . /Command

# Compile the Java code
RUN javac *.java

# Set the default command to run when the container starts
CMD ["java", "Driver"]
