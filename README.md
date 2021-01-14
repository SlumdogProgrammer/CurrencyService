# CurrencyService

## Docker

### Создание образа
docker build -t test-task
### Запуск контейнера
docker run --rm --name currency-service -p 8080:8080 test-task

## Запрос к серверу
После запуска сервиса перейти по адресу
`http://localhost:8080/currencies/compare`
<br/>
по умолчанию стоит RUB, для выбора другой валюты введите её код  `http://localhost:8080/currencies/compare?currency={код валюты}`
