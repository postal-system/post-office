create table if not exists post_office (
    index serial primary key,
    office_name varchar(250) not null,
    address varchar(250) not null,
    operating_time varchar(50),
    metadata varchar(50)
);