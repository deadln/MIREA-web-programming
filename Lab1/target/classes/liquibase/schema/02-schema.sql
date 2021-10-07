--liquibase formatted sql

--changeset deadln:v02

drop table item;
create table item
(
    id   uuid not null primary key,
    name varchar(256),
    description varchar(256),
    price real
)