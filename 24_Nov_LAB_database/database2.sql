use mydb;
create table Customer
(cust_id varchar(5) primary key,
Fname varchar(15) not null,
Lname varchar(15),
Area char(10),
Phone int(10)
);
insert into Customer values
('A01','pritam','das','SA',65343754),
('A02','ankita','manna','SA',6376542),
('A03','arpita','manna','MU',75345754),
('A04','sneha','das','DA',67364425),
('A05','puja','saha','BA',736548542);
create table Movie
(Mv_no int(5) primary key,
Cust_id varchar(5),
Title varchar(15) not null,
star varchar(15) not null,
price int(10));
insert into Movie values
(1,'A02','Bloody','JC',181),
(2,'A04','The Firm','TC',200),
(3,'A01','PRETTY WOMEN','RG',151),
(4,'A06','Home Alone','MC',150),
(5,'A05','The Fugitive','MF',200),
(6,'A03','Coma','MD',200),
(7,'A02','Dracula','GO',150),
(8,'A06','Quick Change','BM',100),
(9,'A03','Gone with the wind','cb',200),
(10,'A05','Carry on Doctor','LP',100);

alter table Movie add constraint fk_custId foreign key(Cust_id) references Customer(Cust_id);

select Title from Movie where price between 100 and 200;
select Cust_id from Movie where Star in(JC,TC,MC);
select * from customer where price between 100 and 200;
select * from Customer where Fname like 'A%';
select Title from Movie where price<=180 and length (Title) = 6;
select concat(Fname,concat('Stays in',concat('his phone no is',concat(Phone))))from Customer where Fname = 'Ivan';
alter table customer modify Fname varchar(25) not null;
select Fname from Customer where phone=null;
select distinct Cust_id from Customer;
alter table Movie modify star varchar(6);

