drop database if exists E_Commerce ;
create database E_Commerce;
use E_Commerce;

create table supplier
(supp_id int primary key , 
 supp_Name varchar(50) not null,
 supp_City varchar(30) not null ,
 supp_phone bigint not null );
 
 insert into supplier values(1,'Rajesh Retails','Delhi',1234567890);
 insert into supplier values(2,'Appario Ltd.','Mumabai',2589631470);
 insert into supplier values(3,'Knome products ','Banglore',9785462315);
 insert into supplier values(4,'Bansal Retails ','Kochi',8975463285);
 insert into supplier values(5,'Mittal Ltd. ','Lucknow',7898456532);
 
 
create table  customer (cus_id int primary key  , cus_Name varchar (20) Not null, 
cus_phoneno varchar(10) Not null , cus_city varchar(30) not null ,
 cus_gender varchar(10));

insert into customer values ( 1,'AAKASH' ,9999999999, 'DELHI', 'M');
insert into customer values (2 , 'AMAN' ,9785463215 ,'NOIDA', 'M');
insert into customer values (3 ,'NEHA', 9999999999 ,'MUMBAI' ,'F');
insert into customer values (4 , 'MEGHA' , 9994562399 , 'KOLKATA', ' F');
insert into customer values (5 , 'PULKIT' ,7895999999, 'LUCKNOW' , 'M');


create table category (Cat_id int primary key , Cat_Name varchar(30) not null) ;
insert into category values(1, 'BOOKS');
insert into category values(2, 'Games');
insert into category values(3, 'Groceries');
insert into category values(4, 'Electronics');



create table product (pro_id int primary key , pro_Name varchar(20) not null
default "Dummy" , product_desc varchar (60) ,Cat_id  int);
insert into product values (1, 'GTA V',' Windows 7 and above with i5 processor and 8GB RAM' ,2);
insert into product values (2 , 'TSHIRT', 'SIZE-L with Black, Blue and White variations',5);
insert into product values (3, 'ROG LAPTOP', 'Windows 10 with 15inch screen, i7 processor, 1TB SSD', 4);
insert into product values (4 ,'OATS ','Highly Nutritious from Nestle', 3);
insert into product values (5,'HARRY POTTER', 'Best Collection of all time by J.K Rowling', 1);
insert into product values (6,' MILK', '1L Toned MIlk', 3);
insert into product values (7 ,'Boat Earphones' ,'5Meter long Dolby Atmos', 4 );
insert into product values (8 ,'Jeans S','tretchable Denim Jeans with various sizes and color', 5);
insert into product values (9,' Project IGI', 'compatible with windows 7 and above', 2);
insert into product values (10 ,'Hoodie', 'Black GUCCI for 13 yrs and above', 5);
insert into product values (11,' Rich Dad Poor Dad', 'Written by RObert Kiyosaki,' ,1);
insert into product values (12, 'Train Your Brain',' By Shireen Stephen', 1);
select  * from product;

create table supplier_pricing(Pricing_id int primary key 
, pro_id int, supp_id int , supp_price int default 0);
insert into Supplier_pricing values(1, 1, 2, 1500);
insert into Supplier_pricing values (2, 3, 5 ,30000);
insert into Supplier_pricing values (3 ,5 ,1, 3000);
insert into Supplier_pricing values (4 ,2, 3, 2500);
insert into Supplier_pricing values (5 ,4 ,1 ,1000);
insert into Supplier_pricing values (6 ,12 ,2 ,780);
insert into Supplier_pricing values (7 ,12 ,4 ,789);
insert into Supplier_pricing values (8 ,3, 1, 31000);
insert into Supplier_pricing values (9 ,1, 5 ,1450);
insert into Supplier_pricing values (10 ,4 ,2, 999);
insert into Supplier_pricing values (11 ,7 ,3 ,549);
insert into Supplier_pricing values (12 ,7 ,4, 529);
insert into Supplier_pricing values (13 ,6 ,2 ,105);
insert into Supplier_pricing values (14 ,6, 1, 99);
insert into Supplier_pricing values (15 ,2 ,5 ,2999);
insert into Supplier_pricing values (16 ,5, 2, 2999);


create table `order`(Ord_id int primary key , ord_amount int not null  , ord_date date not null, cus_id  int , pricing_id int );

insert into `order` values (101 ,1500, '2021-10-06', 2, 1);
insert into `order` values (102 ,1000 ,'2021-10-12' ,3 ,5);
insert into `order` values (103 ,30000 ,'2021-09-16' ,5 ,2);
insert into `order` values (104 ,1500 ,'2021-10-05' ,1,1);
insert into `order` values (105 ,3000 ,'2021-08-16' ,4 ,3);
insert into `order` values (106 ,1450 ,'2021-08-18' ,1 ,9);
insert into `order` values (107 ,789 ,'2021-09-01' ,3 ,7);
insert into `order` values (108 ,780 ,'2021-09-07' ,5 ,6);
insert into `order` values (109 ,3000 ,'2021-09-10' ,5 ,3);
insert into `order` values (110 ,2500 ,'2021-09-10', 2 ,4);
insert into `order` values (111 ,1000, '2021-09-15 ',4 ,5);
insert into `order` values (112 ,789 ,'2021-09-16' ,4 ,7);
insert into `order` values (113 ,31000 ,'2021-09-16' ,1 ,8);
insert into `order` values (114 ,1000 ,'2021-09-16' ,3 ,5);
insert into `order` values (115 ,3000 ,'2021-09-16' ,5 ,3);
insert into `order` values (116 ,99 ,'2021-09-17', 2 ,14);


create table Rating (Rat_id int primary key , Ord_id int ,  Rat_RATSTARS int);
insert into Rating values(1 ,101, 4);
insert into Rating values (2, 102, 3);
insert into Rating values (3 ,103 ,1);
insert into Rating values (4, 104 ,2);
insert into Rating values (5 ,105 ,4);
insert into Rating values (6 ,106, 3);
insert into Rating values (7 ,107 ,4);
insert into Rating values (8 ,108, 4);
insert into Rating values (9 ,109, 3);
insert into Rating values (10 ,110 ,5);
insert into Rating values (11 ,111 ,3);
insert into Rating values (12 ,112 ,4);
insert into Rating values (13 ,113 ,2);
insert into Rating values (14 ,114 ,1);
insert into Rating values (15 ,115 ,1);
insert into Rating values (16 ,116,0);

select*from supplier;
select*from customer;
select*from category;
select*from product;
select*from supplier_pricing;
select*from `order`;
select*from Rating;

#Q4
select (c.cus_gender) ,count(c.cus_gender) as count_Gender from customer c Inner join
  (select c.cus_id  from customer c
  inner join `order` o ON o.cus_id= c.cus_id where o.ord_amount>=3000 group by c.cus_id)
  as v ON v.cus_Id= c.cus_id group by c.cus_gender;
  
  #Q5
 select p.pro_Name , o.* from `order` o
 INNER JOIN customer c  ON c.cus_id=o.cus_id
 INNER JOIN supplier_pricing sp ON sp.Pricing_id=o.pricing_id
 INNER JOIN  product p ON p.pro_id = sp.pro_id
where c.cus_id=2 ;



#Q6
select s.* , v.total_product from supplier s INNER JOIN (
select sp.Supp_id , count(sp.pro_id)as total_product from 
supplier_pricing sp group by sp.supp_id) 
as v ON v.supp_id= s.supp_id where total_product>1;

#Q7
select cat_id,cat_name,pro_name,`sp` as `supplier_price`
from(
SELECT c.cat_id,c.cat_name,p.pro_name,sp.supp_price,min(sp.supp_price) over(partition by c.cat_id) as `sp`
from category c INNER JOIN product p on c.cat_id=p.cat_id join 
supplier_pricing sp
on p.pro_id = sp.pro_id) as `t`
where supp_price = `sp`
order by cat_id; 

#Q8
select  p.pro_id, pro_name
from `order` o
INNER JOIN (Supplier_pricing sp )ON o.pricing_id= sp.pricing_id
INNER JOIN  (Product p) ON p.pro_id = sp.pro_id  where ord_date > '2021-10-05';

#Q9
SELECT CUS_NAME , CUS_GENDER FROM customer
WHERE CUS_NAME LIKE 'A%' OR CUS_NAME LIKE '%A' ; 

#10
DELIMITER &&
create procedure pro()
BEGIN  
select report.supp_id ,report.supp_name,
 case 
When report.average =5  THEN 'EXCELENT SERVICE' 
When report.average >4 THEN 'GOOD SERVICE' 
When report.average >2 THEN 'AVERAGE SERVICE' 
ELSE 'POOR SERVICE'
END AS TYPE_OF_SERVICE
from 
(
select s.supp_name, vv.supp_id, AVG (vv.Rat_RATSTARS) as average FROM supplier s
INNER JOIN(
Select sp.pricing_id , sp.supp_id , sp.pro_id , V.ORD_ID , v.Rat_RATSTARS from  supplier_pricing sp 
INNER JOIN (Select o.ord_id , o.pricing_id , r.Rat_RATSTARS from `order` o  INNER JOIN RATING r ON o.ord_id = r.ord_id ) 
as v ON v.pricing_id = sp.pricing_id) as VV ON s.supp_id= vv.supp_id group by vv.supp_id) as report ;
END &&
DELIMITER ;
call pro()

