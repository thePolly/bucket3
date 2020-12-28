alter table BUCKET3_BUCKET alter column USER_ID rename to USER_ID__U33274 ^
alter table BUCKET3_BUCKET alter column USER_ID__U33274 set null ;
alter table BUCKET3_BUCKET drop constraint FK_BUCKET3_BUCKET_ON_USER ;
drop index IDX_BUCKET3_BUCKET_ON_USER ;
alter table BUCKET3_BUCKET add column USER_NAME longvarchar ^
update BUCKET3_BUCKET set USER_NAME = '' where USER_NAME is null ;
alter table BUCKET3_BUCKET alter column USER_NAME set not null ;
