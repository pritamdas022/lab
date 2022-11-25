use mydb;
create table Customer(
Cust_id varchar(5),
Fname varchar(15),
Lname varchar(15),
Area char(10),
Phone bigint(11),
DOB date,
Payment numeric(6,2)
);
insert into Customer values
('A01','Ivan','Ross','SA',6478920478,1986-01-15,800.50),
('A02','Vandana','Ray','MU',7534827972,1987-12-20,1000.70),
('A03','Pramada','Jauguste','DA',9735620637,1967-08-25,800.50),
('A04','Basu','Navindi','BA',6253748901,1956-02-30,860.00),
('A05','Ravi','Sridhar','NA',NULL,1989-02-15,500.50),
('A06','Rukmini','Aiyer','GH',7845698302,1987-08-23,1500.50);
desc Customer;
select * from Customer;
alter table Customer add New_Date date;
select New_Date from Customer;
update Customer set Phone = 7845668302 where Cust_id ='A02' and Cust_id = 'A04';
select * from Customer;
delete from Customer where Cust_id = 'A01' and Cust_id = 'A05';
truncate table Customer;
insert into Customer values
('C1','pritam','das','SA',65343754,1986-01-15,600.50),
('C2','ankita','manna','SA',6376542,1986-01-15,500.50),
('C3','arpita','manna','MU',75345754,1967-12-20,600.70),
('C4','sneha','das','DA',67364425,1987-08-30,700.50),
('C5','puja','saha','BA',736548542,1956-02-30,760.60);
update Customer set Lname = 'das' where Cust_id = 'C1';
delete from Customer where Fname = 'pritam';
