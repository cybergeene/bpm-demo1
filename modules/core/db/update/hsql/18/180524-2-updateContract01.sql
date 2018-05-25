alter table BPMDEMO_CONTRACT add column VERSION integer ^
update BPMDEMO_CONTRACT set VERSION = 0 where VERSION is null ;
alter table BPMDEMO_CONTRACT alter column VERSION set not null ;
alter table BPMDEMO_CONTRACT add column CREATE_TS timestamp ;
alter table BPMDEMO_CONTRACT add column CREATED_BY varchar(50) ;
alter table BPMDEMO_CONTRACT add column UPDATE_TS timestamp ;
alter table BPMDEMO_CONTRACT add column UPDATED_BY varchar(50) ;
alter table BPMDEMO_CONTRACT add column DELETE_TS timestamp ;
alter table BPMDEMO_CONTRACT add column DELETED_BY varchar(50) ;
