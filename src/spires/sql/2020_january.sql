/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Ronescape
 * Created: Jan 21, 2020
 */



drop table if exists blocks;
create table blocks(
id int auto_increment primary key
,block varchar(255)
,description varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
);


drop table if exists block_lists;
create table block_lists(
id int auto_increment primary key
,block_id varchar(255)
,row_name varchar(255)
,col_name varchar(255)
,first_name varchar(255)
,middle_name varchar(255)
,last_name varchar(255)
,suffix_name varchar(255)
,date_of_birth date
,date_of_death date
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
);



drop table if exists gallery;
create table gallery(
id int auto_increment primary key
,item_code varchar(255)
,description text
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
);
