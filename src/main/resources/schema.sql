-- init
drop table if exists order_items;
drop table if exists orders;
drop table if exists products;

-- create table
create table if not exists orders (
    id bigserial primary key,
    status varchar(40) not null default 'PENDING',
    failure_reason text
);

create table if not exists order_items (
    id bigserial primary key,
    product_id bigint not null,
    quantity int not null,
    orders bigint references orders(id)
);

create table if not exists products (
    id bigserial primary key,
    name varchar(40) not null,
    inventory int not null
);
