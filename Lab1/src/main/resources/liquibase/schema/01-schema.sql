--liquibase formatted sql

--changeset deadln:v01
create table item
(
    id   integer not null primary key,
    name varchar(256),
    description varchar(256),
    price real
)