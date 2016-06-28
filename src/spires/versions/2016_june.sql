/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Maytopacka
 * Created: Jun 16, 2016
 */

drop table if exists official_schedules;
create table official_schedules(
id int auto_increment primary key
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,official varchar(255)
,official_id varchar(255)
,schedule_time_from datetime
,schedule_time_to datetime
,schedule_type varchar(255)
,schedule_address varchar(255)
,parishioner varchar(255)
,parishioner_contact_no varchar(255)
);

alter table my_parishioners add address varchar(255);

drop table if exists official_schedule_types;
create table official_schedule_types(
id int auto_increment primary key
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,schedule_type varchar(255)
);