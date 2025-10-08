create table products
(
    id          bigint auto_increment
        primary key,
    name        varchar(255) not null,
    price       decimal      not null,
    category_id int          not null,
    constraint products_categories_id_fk
        foreign key (category_id) references categories (id)
);