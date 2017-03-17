/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Maytopacka
 * Created: Sep 3, 2016
 */

alter table encoding_funeral2 add parents varchar(255);
update encoding_funeral2 set parents ='';