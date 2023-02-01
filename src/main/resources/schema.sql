create schema if not exist my;
create table if not exist my.persons(
    name char(252),
    surname char(252),
    phone_number char(12),
    city_of_living char(100),
    age integer,
    primary key(name, surname, age)
);
