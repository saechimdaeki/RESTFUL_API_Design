

use springjunseong;


create TABLE tbl_employee(
    id Int not null primary key auto_increment,
    name varchar(255),
    sex varchar(255),
    depart varchar(255),
    dob DATE
)