@echo off

REM Start the blog-service
cd /d "H:\terraform\microservice-kn8\blog-service"
start "blog-service mvn spring-boot:run" cmd /k "mvn spring-boot:run"

REM REM Start the comment-service
cd /d "H:\terraform\microservice-kn8\comment-service"
start  cmd /k "mvn spring-boot:run"

REM Start the analytics-service
cd /d "H:\terraform\microservice-kn8\analytics-service"
start cmd /k "mvn spring-boot:run"

REM Start the api-gateway
cd /d "H:\terraform\microservice-kn8\api-gateway"
start cmd /k "mvn spring-boot:run"


echo All services are starting...
pause

REM Wait for the user to press the "C" key to close all service windows
choice /C C /N /M "Press C to close all service windows..."

echo Closing all service windows...
taskkill /F /FI "WINDOWTITLE eq *blog-service*"
taskkill /F /FI "WINDOWTITLE eq comment-service"
taskkill /F /FI "WINDOWTITLE eq analytics-service"
taskkill /F /FI "WINDOWTITLE eq api-gateway"

echo All services have been closed.
pause
