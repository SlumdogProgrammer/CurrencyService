# CurrencyService
Запрос к серверу
--
После запуска сервиса перейти по адресу
`http://localhost:8080/currencies/compare`
<br/>
Docker
--
### Создание образа
docker build -t test-task
### Запуск контейнера
docker run --rm --name currency-service -p 8080:8080 test-task
