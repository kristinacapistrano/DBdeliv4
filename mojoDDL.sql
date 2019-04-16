create schema Mojo;  -- comment this out if you already created the schema
use Mojo;
show tables;

create table Ground_Company(
address varchar(30) not null, 
name varchar(30), 
Building_no varchar(30));

create table Air_Company(
address varchar(30) not null, 
name varchar(30), 
Building_no varchar(30));

create table Water_Company(
address varchar(30) not null, 
name varchar(30), 
Building_no varchar(30));

create table Ground_Transportation(
make varchar(30) not null,
model varchar(30) not null,
capacity integer
);

create table Air_Transportation(
make varchar(30) not null,
model varchar(30) not null,
capacity integer
);

create table Water_Transportation(
make varchar(30) not null,
model varchar(30) not null,
capacity integer
);

create table Licensed_Driver(
ID varchar(30) not null,
SSN varchar(11) not null,
DOB varchar(30),
Fname varchar(30),
Lname varchar(30),
sex char
);

create table Licensed_Pilot(
ID varchar(30) not null,
SSN varchar(11) not null,
DOB varchar(30),
Fname varchar(30),
Lname varchar(30),
sex char
);

create table Licensed_Captain(
ID varchar(30) not null,
SSN varchar(11) not null,
DOB varchar(30),
Fname varchar(30),
Lname varchar(30),
sex char
);

create table Customer(
customer_ID varchar(30) not null,
SSN varchar(11) not null,
DOB varchar(30),
Fname varchar(30),
Lname varchar(30),
sex char
);
create table Transportation_Purpose(
purpose varchar(30) not null,
make varchar(30) not null,
model varchar(30) not null
);
create table Air_Hangar(
address varchar(30) not null,
name varchar(30),
capacity int
);

create table Parking_Garage(
address varchar(30) not null,
name varchar(30),
capacity int
);

create table Storage_Dock(
address varchar(30) not null,
name varchar(30),
capacity int
);

create table Ground_Service(
make varchar(30) not null,
model varchar(30) not null,
type varchar(30) not null,
time varchar(10),
location varchar(30)
);

create table Owns(
make varchar(30) not null,
model varchar(30) not null,
address varchar(30) not null
);

create table Service_Company(
make varchar(30) not null,
model varchar(30) not null,
type varchar(30) not null,
contract int not null,
address varchar(30),
name varchar(30)
);

create table Rent(
make varchar(30) not null,
model varchar(30) not null,
customer_ID varchar(30) not null
);

alter table Ground_Company add primary key (address);
alter table Air_Company add primary key (address);
alter table Water_Company add primary key (address);

alter table Ground_Transportation add primary key (make, model);
alter table Air_Transportation add primary key (make, model);
alter table Water_Transportation add primary key (make, model);

alter table Transportation_Purpose add primary key (purpose, make, model);

alter table Licensed_Driver add primary key (ID, SSN);
alter table Licensed_Pilot add primary key (ID, SSN);
alter table Licensed_Captain add primary key (ID, SSN);
alter table Customer add primary key (customer_ID, SSN);

alter table Air_Hangar add primary key (address);
alter table Parking_Garage add primary key (address);
alter table Storage_Dock add primary key (address);

alter table Ground_Service add primary key (make, model, type);
alter table Owns add primary key (make, model, address);
alter table Service_Company add primary key (make, model, type, contract);

alter table Ground_Service add foreign key(make, model) references Ground_Transportation(make, model);
alter table Service_Company add foreign key(make, model) references Ground_Transportation(make, model);
alter table Rent add foreign key(customer_ID) references Customer(customer_ID);
alter table Rent add foreign key(make, model) references Ground_Transportation(make, model);