create database wangbatuozi
USE wangbatuozi  
create table RQ
(  
RQid int primary key identity(1,1),   
RQname varchar(50)  not null,   
RQintroduce nvarchar(30),   
RQimage nvarchar(100)
)
create table U
(  
[Uid] int primary key identity(1,1),   
Uemail varchar(100),   
Uidentitytype int,   
Uidentitynumber nvarchar(50),
Upassword nvarchar(50) not null,
Hinterestid nvarchar(400),
Hleaseid nvarchar(400),
Uname nvarchar(50) not null,
Uphone varchar(15),
Uhead nvarchar(100)
)
create table AD
(  
ADid int primary key identity(1,1),   
ADemail varchar(100),   
ADidentitytype int,   
ADidentitynumber nvarchar(50),
ADpassword nvarchar(50) not null,
Hinterestid text,
Hleaseid text,
ADname nvarchar(50) not null,
ADphone varchar(15),
ADhead nvarchar(100)
)
create table H
(  
Hid int primary key identity(1,1),
RQid int not null,
foreign key(RQid) references RQ(RQid),   
Hname nvarchar(30) not null,   
Hrent int not null,
Haddress nvarchar(30) not null,
Hmethod nvarchar(30) not null,
Hstructure nvarchar(30),
Hfloorface nvarchar(30),
Himage text,
Hintroduce text
)
