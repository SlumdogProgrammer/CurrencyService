# CurrencyService
### Создание образа
docker build -t test-task
### Запуск контейнера
docker run --rm --name currency-service -p 8080:8080 test-task
