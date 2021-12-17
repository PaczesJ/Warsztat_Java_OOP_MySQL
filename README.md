# Warsztat_Java_OOP_MySQL
## Pacześny Jakub
Warsztat mający na celu ugruntowanie wiedzy z Object Oriented Programming &amp; MySQL/DataBases.

Technologia używana w ramach projektu to język Java oraz MySQL.
# Wstęp
Celem projektu jest wytworzenie obiektowej warstwy dostępu do danych. W ramach warsztatu utworzę klasę UserDao, 
dzięki której będę mógł wykonywać operacje na bazie danych.

Dane będę przechowywać w bazie danych o nazwie workshop2 w tabeli o nazwie users.

Tabela będzie wyglądać następująco:
- Field       Type            Null    Key     Default     Extra,
- id          int(11)         NO      PRI     NULL        AUTO_INC,
- email       varchar(255)    NO      UNI     NULL,
- username    varchar(255)    NO              NULL,
- password    varchar(60)     NO              NULL,

 

# Aplikacja
- utworzenie bazy danych,
- zapytania:
    + dodawanie użytkownika,
    + zmiana danych,
    + pobieranie po id,
    + usuwanie po id,
    + wybieranie wszystkich użytkowników
