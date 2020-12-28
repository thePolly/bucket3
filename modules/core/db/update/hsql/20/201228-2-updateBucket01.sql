alter table BUCKET3_BUCKET alter column USER_NAME rename to USER_NAME__U76546 ^
alter table BUCKET3_BUCKET alter column USER_NAME__U76546 set null ;
-- alter table BUCKET3_BUCKET add column USER_NAME varchar(36) ^
-- update BUCKET3_BUCKET set USER_NAME = <default_value> ;
-- alter table BUCKET3_BUCKET alter column USER_NAME set not null ;
alter table BUCKET3_BUCKET add column USER_NAME varchar(36) not null ;
