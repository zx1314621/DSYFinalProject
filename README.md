
When you download this project, two operations you need to do;

1. you need to set you database information in properties/jdbc.properties firstly;

And then use following sql sentences build database;


create database finalProject;

use finalProject;

create table `user` (
    `user_id` int (11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `password` varchar (150) NOT NULL
); 

insert into user (password) values ('root');



2. import project, then right click project Properties -> Java Build Path -> Libraries -> Add Library -> Server Runtime -> Tomcat

then all error will missing.


