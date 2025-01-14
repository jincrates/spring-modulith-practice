-- init
drop table if exists customers;

-- create table
create table if not exists customers (
    id bigserial primary key,
    code varchar(50) unique not null,
    phone varchar(20) not null,
    nickname varchar(40) not null
);
