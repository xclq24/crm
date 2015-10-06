DROP DATABASE IF EXISTS db_crm;
CREATE DATABASE db_crm CHARSET utf8;
USE db_crm;

/*客户信息表*/
DROP TABLE IF EXISTS customer;
CREATE TABLE customer (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(20) NOT NULL,
	source VARCHAR(20) NOT NULL,
	position VARCHAR(20),
	type VARCHAR(20) NOT NULL,
	gender CHAR NOT NULL,
	email VARCHAR(20),
	birthday DATE NOT NULL,
	phone VARCHAR(20) NOT NULL,
	qq VARCHAR(20),
	addr VARCHAR(20),
	weibo VARCHAR(20),
	tel VARCHAR(20),
	msn VARCHAR(20),
	company VARCHAR(20),
	builder VARCHAR(20) NOT NULL,
	modifier VARCHAR(20),
	state VARCHAR(20) NOT NULL,
	note VARCHAR(20),
	createtime DATETIME,
	modifytime DATETIME
)charset=utf8;

INSERT INTO customer(name,source,position,type,gender,email,birthday,phone,qq,addr,weibo,tel,msn,company,builder,modifier,state,note,createtime,modifytime) 
 VALUES ('客户1','自己上门','老板','供应商','男','123@163.com','1980-01-01','11122223333','66666','隔壁','微博名','86666111','msn','公司1','员工1','员工2','潜在客户','我是备注','2002-05-05 15:55:41','2003-05-05 15:55:41');
INSERT INTO customer(name,source,position,type,gender,email,birthday,phone,qq,addr,weibo,tel,msn,company,builder,modifier,state,note,createtime,modifytime) 
 VALUES ('客户2','自己上门','老板','供应商','女','1234@163.com','1987-07-01','11777723333','67766','隔壁','微博名2','86666111','msn2','公司2','员工2','员工3','潜在客户','我是备注2','2002-05-05 15:55:41','2003-05-05 15:55:41');

/*客户分配表*/
DROP TABLE IF EXISTS allot;
CREATE TABLE allot(
	id INT PRIMARY KEY AUTO_INCREMENT,
	ename VARCHAR(20) NOT NULL,
	cname VARCHAR(20) NOT NULL
)charset=utf8;

INSERT INTO allot(ename,cname) VALUES ('员工1','客户1');
INSERT INTO allot(ename,cname) VALUES ('员工2','客户2');

/*联系记录表*/
DROP TABLE IF EXISTS record;
CREATE TABLE record(
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(20) NOT NULL,
	time DATE,
	type VARCHAR(20),
	next DATE,
	contacter VARCHAR(20) NOT NULL,
	theme VARCHAR(20),
	note VARCHAR(100)
)charset=utf8;
INSERT INTO record (name,time,type,next,contacter,theme,note) VALUES ('客户1','2014-01-01','打电话','2015-12-01','客户1','主题1','我又是备注');
INSERT INTO record (name,time,type,next,contacter,theme,note) VALUES ('客户2','2014-01-01','走访','2015-12-01','客户1','主题1','我又是备注');

/*客户来源表*/
DROP TABLE IF EXISTS source;
CREATE TABLE source(
	id INT PRIMARY KEY AUTO_INCREMENT,
	source VARCHAR(20) NOT NULL UNIQUE
)charset=utf8;
INSERT INTO source (source) VALUES('自己上门');
INSERT INTO source (source) VALUES('朋友推荐');
INSERT INTO source (source) VALUES('百度网');
INSERT INTO source (source) VALUES('搜房网');

/*客户类型表*/
DROP TABLE IF EXISTS type;
CREATE TABLE type(
	id INT PRIMARY KEY AUTO_INCREMENT,
	type VARCHAR(20) NOT NULL UNIQUE
)charset=utf8;
INSERT INTO type (type) VALUES('客户');
INSERT INTO type (type) VALUES('合作伙伴');
INSERT INTO type (type) VALUES('供应商');

/*客户状态表*/
DROP TABLE IF EXISTS state;
CREATE TABLE state(
	id INT PRIMARY KEY AUTO_INCREMENT,
	state VARCHAR(20) NOT NULL UNIQUE,
	description VARCHAR(20)
)charset=utf8;
INSERT INTO state (state,description) VALUES('潜在客户','可能成为客户的人...');
INSERT INTO state (state,description) VALUES('欠款客户','欠款的客户...');

/*客户关怀表*/
DROP TABLE IF EXISTS care;
CREATE TABLE care(
	id INT PRIMARY KEY AUTO_INCREMENT,
	theme VARCHAR(20),
	object VARCHAR(20) NOT NULL,
	time DATETIME,
	next DATE,
	way VARCHAR(20),
	people VARCHAR(20) NOT NULL,
	note VARCHAR(20)
)charset=utf8;
INSERT INTO care (theme,object,time,next,way,people,note) VALUES('主题1','关怀客户1','2014-11-19 20:20:20','2015-12-12','走访','员工1','我还是备注');
INSERT INTO care (theme,object,time,next,way,people,note) VALUES('主题2','关怀客户2','2015-02-12 12:00:03','2015-11-11','走访','员工1','我还是备注');

/*联系人表*/
DROP TABLE IF EXISTS contact;
CREATE TABLE contact(
	id INT PRIMARY KEY AUTO_INCREMENT,
	customer VARCHAR(20) NOT NULL,
	name VARCHAR(20) NOT NULL,
	gender CHAR,
	age int(3),
	position VARCHAR(20),
	phone VARCHAR(20) NOT NULL,
	relation VARCHAR(20)
)charset=utf8;
INSERT INTO contact(customer,name,gender,age,position,phone,relation) VALUES('客户1','联系人1','男',30,'老板','11122223366','某种关系');
INSERT INTO contact(customer,name,gender,age,position,phone,relation) VALUES('客户2','联系人2','男',33,'老板','11122223366','某种关系2');

/*员工表*/
DROP TABLE IF EXISTS user;
CREATE TABLE user (	 
	id INT(10) PRIMARY KEY auto_increment,
	name VARCHAR(20) NOT NULL,
	age INT(3) NOT NULL,
	gender CHAR NOT NULL,
	nation VARCHAR(20) NOT NULL,
	education VARCHAR(20) NOT NULL,
	marriage VARCHAR(20) NOT NULL,
	dept VARCHAR(20) NOT NULL,
	role VARCHAR(20) NOT NULL,
	tel VARCHAR(20),
	hobby VARCHAR(50),
	salary_idcard VARCHAR(20) NOT NULL,
	phone VARCHAR(20) NOT NULL,
	idcard VARCHAR(20) NOT NULL,
	addtime	DATETIME NOT NULL,
	modifytime DATETIME,
	builder VARCHAR(20) NOT NULL,
	modifier VARCHAR(20),
	email VARCHAR(20) NOT NULL,
	address VARCHAR(20) NOT NULL,
	username VARCHAR(20) UNIQUE NOT NULL,
	pwd VARCHAR(20) NOT NULL
)charset=utf8;
INSERT INTO user(
	name,age,gender,nation,education,
	marriage,dept,role,tel,hobby,salary_idcard,
	phone,idcard,addtime,modifytime,builder,modifier,email,address,username,pwd
) VALUES(
	'老王',20,'男','汉','本科',
	'已婚','财务部','管理员','234234234234','玩皮球','1233123433445',
	'12333232344','333333333333333333','2013-12-23 23:23:23',null,
	'老王','小王','776@qq.com','宁波','admin','1234'
);
INSERT INTO user(
	name,age,gender,nation,education,
	marriage,dept,role,tel,hobby,salary_idcard,
	phone,idcard,addtime,builder,modifier,email,address,username,pwd
) VALUES(
	'老吴',20,'男','汉','本科',
	'已婚','财务部','管理员','234234234234','玩篮球','1233123433445',
	'12333232344','333333333333333333','2013-12-23 23:23:23',
	'老王','小王','776@qq.com','宁波','admin2','1234'
);

/*角色表*/
DROP TABLE IF EXISTS role;
CREATE TABLE role(	
	id INT(10) PRIMARY KEY auto_increment,
	name  VARCHAR(20) NOT NULL UNIQUE,
	level INT(10) NOT NULL
)charset=utf8;
INSERT INTO role(name,level)VALUES('管理员',3);
INSERT INTO role(name,level)VALUES('老板',2);
INSERT INTO role(name,level)VALUES('员工',1);

/*部门表*/
DROP TABLE IF EXISTS dept;
CREATE TABLE dept(
	id INT(10) PRIMARY KEY auto_increment,
	name  VARCHAR(20) NOT NULL UNIQUE,
	description VARCHAR(50)
)charset=utf8;
INSERT INTO dept(name,description)VALUES('财务部','有钱');
INSERT INTO dept(name,description)VALUES('人力资源部','招人');

/*房屋信息表*/
DROP TABLE IF EXISTS house;
CREATE TABLE house(			
	id INT(10) PRIMARY KEY auto_increment,
	type VARCHAR(20) NOT NULL ,
	manager	VARCHAR(20) NOT NULL,
	address	VARCHAR(200) ,
	price  DOUBLE(8,2)	NOT NULL,
	environment VARCHAR(200)
)charset=utf8;
INSERT INTO house(type,manager,address,price,environment)VALUES('两室一厅','老王','三里屯',8888.88,'风水好');
INSERT INTO house(type,manager,address,price,environment)VALUES('三室两厅','老李','前门',8888.88,'风水好');


/*房屋类型表*/
DROP TABLE IF EXISTS house_type;
CREATE TABLE house_type(	
	id INT(10) PRIMARY KEY auto_increment,
	name VARCHAR(20) NOT NULL UNIQUE
)charset=utf8;

INSERT INTO house_type(name)VALUES('两室一厅');
INSERT INTO house_type(name)VALUES('三室两厅');

/*公告表*/
DROP TABLE IF EXISTS notice;
CREATE TABLE notice(	
	id INT(10) PRIMARY KEY auto_increment,
	name VARCHAR(20) NOT NULL,
	theme VARCHAR(20) NOT NULL,
	time datetime NOT NULL,
	deadline datetime,
	message varchar(200) NOT NULL
)charset=utf8;
INSERT INTO notice(name,theme,message,time,deadline)VALUES('李四','最近要开会','记得带钱','2014-09-02 23:34:12','2014-09-03 23:34:12');
INSERT INTO notice(name,theme,message,time,deadline)VALUES('李四','最近要开会','记得带钱','2014-09-02 23:34:12','2014-09-03 23:34:12');

/*邮件表*/
DROP TABLE IF EXISTS email;
CREATE TABLE email(		
	id INT(10) PRIMARY KEY auto_increment,
	sender VARCHAR(20) NOT NULL,
	receiver VARCHAR(20),
	theme VARCHAR(50),
	message VARCHAR(200),
	time datetime
)charset=utf8;

INSERT INTO email(sender,receiver,theme,message,time)VALUES('老王','老李','你好','你好，你大爷1','2015-09-10 12:12:00');
INSERT INTO email(sender,receiver,theme,message,time)VALUES('老王','老李','你好','你好，你大爷2','2015-09-10 12:12:00');
INSERT INTO email(sender,receiver,theme,message,time)VALUES('老周','老王','你好','你好，你大爷3','2015-09-10 12:12:00');
INSERT INTO email(sender,receiver,theme,message,time)VALUES('老周','老王','你好','你好，你大爷4',null);
INSERT INTO email(sender,receiver,theme,message,time)VALUES('老王','老陈','你好','你好，你大爷5',null);
