create database shoppingOnline;
use shoppingOnline;
create table accounts(
                         `id` int primary key NOT NULL,
                         `username` nvarchar(50) NOT NULL,
                         `password` nvarchar(50) NOT NULL,
                         `fullname` nvarchar(50) NOT NULL,
                         `address` nvarchar(255) NOT NULL,
                         `phone` int NOT NULL,
                         `email` nvarchar(50) NOT NULL,
                         `photo` nvarchar(50) NOT NULL,
                         `activated`int  NOT NULL,
                         `admin`int NOT NULL
);
create table categories(
                           `id` int primary key NOT NULL,
                           `name` nvarchar(50) NOT NULL,
                           `status` int NOT NULL
);

create table orders(
                       `id` int primary key NOT NULL,
                       `address` varchar(255) NULL,
                       `available` int NULL,
                       `confirm` int NULL,
                       `createdate` date NULL,
                       `price` float NULL,
                       `username` varchar(255) NULL,
                       `account_id` int NULL,
                       constraint FKdujockiancjr5q3jqf74hc90i
                           foreign key (account_id) references accounts (id)
);
CREATE TABLE products(
                         `id` int primary key NOT NULL,
                         `about` varchar(255) NULL,
                         `available` int NOT NULL,
                         `createdate` date NULL,
                         `discount` int NOT NULL,
                         `image` varchar(255) NULL,
                         `name` varchar(255) NULL,
                         `price` float NOT NULL,
                         `quantity` int NOT NULL,
                         `status` int NOT NULL,
                         `categoryid` int NULL,
                         constraint FKdujockiancjr5q3jqf74hc90h
                             foreign key (categoryid) references categories (id)
);
create table orderdetails(
                             `id` int primary key NOT NULL,
                             `price` float NULL,
                             `quantity` int NULL,
                             `orderid` int NULL,
                             `productid` int NULL,
                             constraint FKdujockiancjr5q3jqf74hc90z
                                 foreign key (orderid) references orders (id),
                             constraint FKg9du18dwb7uy1iyqj45sdwjrh
                                 foreign key (productid) references products (id)
);
