# LMS Backend

## Описание
Backend сервис для LMS на Spring Boot с PostgreSQL, Keycloak и MinIO.

## Запуск
1. Установите Docker и Docker Compose.
2. Клонируйте и перейдите в директорию проекта.
3. Выполните:
   ```
   docker-compose up --build
   ```
4. Приложение доступно на порту 8081.
5. Swagger UI: http://localhost:8081/swagger-ui/index.html

## Данные по умолчанию
- Keycloak Admin: admin/admin123
- PostgreSQL: user/password

## CI/CD
GitHub Actions настроен для сборки и пуша образа на Docker Hub.
