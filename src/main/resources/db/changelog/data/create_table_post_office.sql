create table if not exists post_office (
    index serial primary key,
    office_name varchar(250) not null,
    address varchar(250) not null,
    start_time time,
    end_time time,
    metadata varchar(50)
);