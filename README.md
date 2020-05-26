
you need to set you database information in properties/jdbc.properties firstly;

And then use following sql sentences build database;


create database finalProject;

use finalProject;

create table `user` (
    `user_id` int (11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `password` varchar (150) NOT NULL
); 

insert into user (password) values ('root');


