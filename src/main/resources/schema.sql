create table if not exists orders (
    id bigserial primary key not null
);

create table if not exists order_items (
    id bigserial primary key not null,
    order_id bigint not null,
    product_id bigint not null,
    quantity int not null,
    foreign key (order_id) references orders(id)
);
