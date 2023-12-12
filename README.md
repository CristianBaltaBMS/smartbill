# SmartBill Project

## Api Functionality

Un API REST-full ce expune functionalitatea necesara pentru lucrul cu numere din secventa Fibonnaci. Un utilizator
trebuie să poată:

* genera "următorul" număr din secvența Fibonacci asociată lui
* cere trecerea înapoi cu o poziție în secvența sa de numere
* lista toate numerele din secvența sa generate pana la momentul curent
*

Ex:

* client1 -> apel generare 1 -> rezultat: 1
* client1 -> apel generare 2 -> rezultat: 1
* client1 -> apel generare 3 -> rezultat: 2
* client2 -> apel generare 1 -> rezultat: 1
* client1 -> apel generare 4 -> rezultat: 3
* client2 -> apel generare 2 -> rezultat: 1
* client2 -> apel pas înapoi 1 -> rezultat: OK
* client2 -> apel generare 3 -> rezultat: 1
* client2 -> apel generare 4 -> rezultat: 2
* client1 -> apel listare valori generate -> rezultat: 1, 1, 2, 3

## Manual testing

### Run the application

* hava a running database with a working user and password set up (for ```maven clean install```)

```
mvn clean install
docker build -t smartbill .
docker compose-up
```

### For manual testing use swagger or the provided Postman collection.

* http://localhost:8080/swagger-ui/index.html#/
