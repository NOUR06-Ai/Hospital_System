
show databases;

Create DATABASE College;

USE College;

CREATE TABLE Patients(

    ID INT  PRIMARY KEY,
    Phone VARCHAR(11) NOT NULL,
    FirstName VARCHAR(100) NOT NULL,
    LastName VARCHAR(100) NOT NULL,
    Gender char(1) NOT NULL,
    BirthDate DATE NOT NULL,
    BloodGroup char(3) Not Null,
    Address VARCHAR(50) Not NULL,
    AnyMajor char(3) Not NULL,
    Symptoms varchar(50) NULL,
    Diagnosis varchar(50) NULL,
    Medicines varchar(50) NULL,
    Ward varchar(10) NULL
);

SELECT * FROM Patients;

INSERT INTO Patients 
values
(1,'05021302103','Ahmed','Ali','M','2000-03-01' , 'A+','Cairo'    ,'Yes'),
(2,'06021330491','Ali','Nabil','M','2001-10-10' , 'A-','Alexandia', 'No'),
(3,'07213943295','Fatma','Hany','F','2018-04-01', 'B+','Torino'   ,'Yes'),
(4,'08134590912','Rania','Saad','F','2020-02-01', 'B-','Madrid'   ,'Yes'),
(5,'09213432213','Reham','Omar','F','2010-10-30', 'AB+','Barcalona', 'No');

SELECT * FROM Patients;