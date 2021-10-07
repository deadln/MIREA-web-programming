--liquibase formatted sql

--changeset deadln:v03

create table cart
(
    id uuid not null primary key,
    user_id uuid,
    item_id uuid
)