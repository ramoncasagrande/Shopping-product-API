create schema if not exists	products;

create table products.category (
	id bigserial primary key,
	nome varchar(100) not null
);

create table products.product (
	id bigserial primary key,
	product_identifier varchar not null,
	nome varchar(100) not null,
	descricao varchar not null,
	preco float not null,
	category_id bigint REFERENCES products.category(id)
);
