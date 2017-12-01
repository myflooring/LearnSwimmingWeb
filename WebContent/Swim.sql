create database swimming;
use swimming;
create table user(
uid int primary key  Auto_Increment,
userid varchar(255),
username varchar(255),
userpassword varchar(255),
img varchar(255),
content longtext,
education varchar(255),
tele varchar(255),
email varchar(255)
);

create table coursetotal(
ctid int primary key  Auto_Increment,
ctname varchar(255),
teachername varchar(255),
studentnumber int default 0,
ctbrief varchar(255),
img varchar(255)
);

create table course(
ctid int,
chid int,
ctname varchar(255),
ctbrief varchar(255),
cttime varchar(255),
videourl varchar(255),
primary key(ctid,chid)
)

create table subscribeCourse(
uid int,
ctid int,
sdate datetime,
primary key(uid,ctid),
foreign key(uid) references user(uid),
foreign key(ctid) references coursetotal(ctid)
);

create table coursecomment(
ccid int primary key  Auto_Increment,
content longtext,
cdate datetime,
uid int,
ctid int,
goodnumber int default 0,
badnumber int default 0,
foreign key(uid) references user(uid),
foreign key(ctid) references coursetotal(ctid)
);

create table courseprogress(
uid int,
ctid int,
chid int,
pdate datetime,
lastlearn varchar(255),
primary key(uid,ctid),
foreign key(uid) references user(uid),
foreign key(ctid) references coursetotal(ctid),
foreign key(chid) references course(chid)
);

create table tiezi(
tid int primary key  Auto_Increment,
uid int,
tdate datetime,
content longtext,
theme varchar(255),
themetie int default 0,
huitienum int default 0,
foreign key(uid) references user(uid),
CONSTRAINT theme_tiezi CHECK (themetie in(0,1))
);

create table article(
aid int primary key  Auto_Increment,
adate datetime,
author varchar(255),
Clicknum int default 0,
content longtext

);