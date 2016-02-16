/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.cashiering;

/**
 *
 * @author Ronald
 */
public class S2_cashiering {

    public static class to_cashiering {

        public final int id;
        public final String account;
        public final double rate;
        public final int is_active;
        public final int parent;
        public int size;
        public final String account_id;
        public final String account_name;
        public final String account_type;
        public final String account_type_id;
        public final String fix_rate;
        public final int incremental;
        public final String accounting_group_id;
        public final String accounting_group_name;
        public final String accounting_account_id;
        public final String accounting_account_name;
        public final String accounting_account_type;
        public final String accounting_account_type_id;
        public double cash;
        public double check;
        public String check_no;
        public String bank;

        public to_cashiering(int id, String account, double rate, int is_active, int parent, String account_id, String account_name, String account_type, String account_type_id, String fix_rate, int incremental, String accounting_group_id, String accounting_group_name, String accounting_account_id, String accounting_account_name, String accounting_account_type, String accounting_account_type_id, double cash, double check, String check_no, String bank) {
            this.id = id;
            this.account = account;
            this.rate = rate;
            this.is_active = is_active;
            this.parent = parent;
            this.account_id = account_id;
            this.account_name = account_name;
            this.account_type = account_type;
            this.account_type_id = account_type_id;
            this.fix_rate = fix_rate;
            this.incremental = incremental;
            this.accounting_group_id = accounting_group_id;
            this.accounting_group_name = accounting_group_name;
            this.accounting_account_id = accounting_account_id;
            this.accounting_account_name = accounting_account_name;
            this.accounting_account_type = accounting_account_type;
            this.accounting_account_type_id = accounting_account_type_id;
            this.cash = cash;
            this.check = check;
            this.check_no = check_no;
            this.bank = bank;
        }

        public to_cashiering(int id, String account, double rate, int is_active, int parent, int size, String account_id, String account_name, String account_type, String account_type_id, String fix_rate, int incremental, String accounting_group_id, String accounting_group_name, String accounting_account_id, String accounting_account_name, String accounting_account_type, String accounting_account_type_id, double cash, double check, String check_no, String bank) {
            this.id = id;
            this.account = account;
            this.rate = rate;
            this.is_active = is_active;
            this.parent = parent;
            this.size = size;
            this.account_id = account_id;
            this.account_name = account_name;
            this.account_type = account_type;
            this.account_type_id = account_type_id;
            this.fix_rate = fix_rate;
            this.incremental = incremental;
            this.accounting_group_id = accounting_group_id;
            this.accounting_group_name = accounting_group_name;
            this.accounting_account_id = accounting_account_id;
            this.accounting_account_name = accounting_account_name;
            this.accounting_account_type = accounting_account_type;
            this.accounting_account_type_id = accounting_account_type_id;
            this.cash = cash;
            this.check = check;
            this.check_no = check_no;
            this.bank = bank;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public double getCash() {
            return cash;
        }

        public void setCash(double cash) {
            this.cash = cash;
        }

        public double getCheck() {
            return check;
        }

        public void setCheck(double check) {
            this.check = check;
        }

        public String getCheck_no() {
            return check_no;
        }

        public void setCheck_no(String check_no) {
            this.check_no = check_no;
        }

        public String getBank() {
            return bank;
        }

        public void setBank(String bank) {
            this.bank = bank;
        }

    }
}
