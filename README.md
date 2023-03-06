# Data Driven Travel - RV
Create a Travel-app for automated testing with data driven from SQL database<br>

[data types](https://www.w3schools.com/sql/sql_datatypes.asp),
[hsqldb](http://hsqldb.org/),
[java api](https://docs.oracle.com/javase/7/docs/api/),
[sql](https://www.w3schools.com/sql/)

## Steps
* Ensure the Eclipse IDE has Maven by looking for M2E from Help About
* Install `DBViewer Plugin 1.2.2.v20101009` by ZIGEN from the Eclipse IDE marketplace
* Import into Eclipse as Git with smart import (accepting all defaults in wizard)
* Let the IDE finish building dependencies before proceeding (see bottom right of Eclipse)
* Run as JUnit test the file `TravelAppTest.java` for sanity testing the local database



**CREATE TABLE CREATE TABLE Users (Id CHAR(36), name VARCHAR(100), age INT, location VARCHAR(100), PRIMARY KEY(Id)) CREATE TABLE RovrWallet (Id CHAR(36), currency VARCHAR(100), userId CHAR(36), balance INT, PRIMARY KEY(Id), FOREIGN KEY(userId) REFERENCES Users(Id))

**USER NAMES & DETAILS INSERT INTO Users (Id, name, age, location) VALUES ('2ee133dc-c969-442e-97b1-be9a51709989', 'Nathan', 27, 'Haslingden') INSERT INTO Users (Id, name, age, location) VALUES ('29be4f38-5893-4183-b8c9-d14512f78204', 'Will', 25, 'Chorley') INSERT INTO Users (Id, name, age, location) VALUES ('f82befee-59a7-411b-9156-e685425758f9', 'Tommy', 26, 'Chorley') INSERT INTO Users (Id, name, age, location) VALUES ('5b390415-b38a-4765-bb73-ac4723d2c801', 'Tom', 30, 'Utley')

**WALLET BALANCES (linked to userId) INSERT INTO RovrWallet (Id, currency, userId, balance) VALUES ('6c2c9481-7378-42c1-bee7-fb79087be104', 'RoVR Coin', '2ee133dc-c969-442e-97b1-be9a51709989', 30) INSERT INTO RovrWallet (Id, currency, userId, balance) VALUES ('0c28ebc1-b637-4615-9213-5b8e97e87df3', 'RoVR Coin', '29be4f38-5893-4183-b8c9-d14512f78204', 40) INSERT INTO RovrWallet (Id, currency, userId, balance) VALUES ('103ba20d-31d9-476a-85ba-65da5ba25c1b', 'BitCoin', 'f82befee-59a7-411b-9156-e685425758f9', 120) INSERT INTO RovrWallet (Id, currency, userId, balance) VALUES ('bf8603e0-3074-4659-93fa-f424dc268ad3', 'RoVR Coin', '5b390415-b38a-4765-bb73-ac4723d2c801', 25)

**FIND DATA SELECT Users.location FROM Users SELECT Users.name FROM Users