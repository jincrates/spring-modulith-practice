create table if not exists orders (
    id bigserial primary key
);

create table if not exists order_items (
    id bigserial primary key,
    product_id bigint not null,
    quantity int not null,
    orders bigint references orders(id)
);
