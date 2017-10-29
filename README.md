# rest-user

Example End Points

##Create: 
$ curl -i -X POST -H "Content-Type:application/json" http://localhost:8080/users -d '{"id": "12345","fName": "John","lName": "Smith","email": "John.Smith@gmail.com","pinCode": "123456","birthDate": "02-MAR-2980"}'

##Update: 
$ curl -i -X POST -H "Content-Type:application/json" http://localhost:8080/user/update -d '{"id": "12345","fName": "John","lName": "Smith","email": "John.Smith@gmail.com","pinCode": "654321","birthDate": "02-MAR-2980"}'

##Delete:
$ curl -i -X GET http://localhost:8080/user/delete/12345