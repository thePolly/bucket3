-- begin BUCKET3_USER
create table BUCKET3_USER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    user_name varchar(255),
    password varchar(255),
    --
    primary key (ID)
)^
-- end BUCKET3_USER
-- begin BUCKET3_BUCKET
create table BUCKET3_BUCKET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    user_name varchar(36) not null,
    name varchar(255),
    priority varchar(255),
    description varchar(255),
    date timestamp,
    --
    primary key (ID)
)^
-- end BUCKET3_BUCKET
