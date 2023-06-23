# POC Appels de service

On test les appels de service, avec:

### Email.java
```
java/org/acme/mails/springboot/Email.java
```
L'objet Email, avec un destinataire et un message.


### SendEmailService.java
```
java/org/acme/mails/services/SendEmailService.java
```
Un service, avec la fonction send(). 
La fonction send() sert à afficher un message dans le terminal.

### mail.bpmn
```
resources/org/acme/mails/mail.bpmn
```
Le BPMN.
En recevant un objet mail, il appelle send() du service SendEmailService pourafficher un message dans le terminal.


## Tester

Pour tester, on lance avec cette commande.
```
mvn clean compile spring-boot:run
```

Après ça, http://localhost:8080 est actif, et on retrouve la liste des mails qu'on va "envoyer" dans http://localhost:8080/mail

On peux ajouter des mail depuis un autre terminal avec cette commande:
```sh
curl -X POST -H 'Content-Type:application/json' -H 'Accept:application/json' -d '{"recipient" : "adressemail@mail.com", "message" : "Salut"}' http://localhost:8080/mail
```

