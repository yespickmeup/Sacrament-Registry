/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Guinness
 * Created: Jul 1, 2016
 */

alter table receipts add check_bank varchar(255);
alter table receipts add is_fixed int;
alter table receipts change message message text;

drop table if exists banks;
create table banks(
id int auto_increment primary key
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,bank varchar(255)
);

update receipts set is_fixed=1;