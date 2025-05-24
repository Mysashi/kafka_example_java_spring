# kafka_example_java_spring
Пример подключения Кафка для общения между двумя сервисами(Skb-Spring)

## Инструкция
1.Собрать docker-compose для кафки из папки mail1

2.Запустить докер контейнер Kafka

3.Запустить сервис Mail1 и Mail2 одновременно

4.Отправить POST апи запрос по адресу http://localhost:8080/mail объектом Mail, пример:
{
    "id" : 0,
    "name": "Message",
    "context": "HELLO",
    "sent_date" : "25/5/2025"
}
Наблюдать появления сообщения у сервиса Mail2 в консоли



