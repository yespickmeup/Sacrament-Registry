/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Maytopacka
 * Created: Apr 9, 2016
 */
/* 04/09/2016 */
alter table encoding_confirmation add address_of_parents varchar(255);
alter table encoding_confirmation add place_of_confirmation varchar(255);
alter table encoding_confirmation add registry_no varchar(255);

update encoding_confirmation set address_of_parents='';
update encoding_confirmation set place_of_confirmation='';
update encoding_confirmation set registry_no='';

alter table encoding_funeral2 add age varchar(255);
update encoding_funeral2 set age='';
alter table encoding_funeral2 add father varchar(255);
alter table encoding_funeral2 add mother varchar(255);
update encoding_funeral2 set father='';
update encoding_funeral2 set mother='';

/* */

