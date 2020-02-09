package com.bluk.account;
import java.util.LinkedList;

public class Account {

    private int accountId;
    private String accountName;
    private int accountAvatarId;
    //private String accountCountry;
    private String accountEmail;
    private String accountPassword;
    private LinkedList<Character> characters;
    //private Boolean accountRegulation;
    private AccountSettings accountSettings;

    private Account(){
    }

    public String getAccountName() {
        return accountName;
    }

    public AccountSettings getAccountSettings() {
        return accountSettings;
    }

    public static AccountBuilder builder(){
        return new AccountBuilder();
    }

    public static final class AccountBuilder {
        private int accountId;
        private String accountName;
        private int accountAvatarId;
        //private String accountCountry;
        private String accountEmail;
        private String accountPassword;
        private LinkedList<Character> characters;
        //private Boolean accountRegulation;
        private AccountSettings accountSettings;

        public AccountBuilder accountId(int accountId) {
            this.accountId = accountId;
            return this;
        }

        public AccountBuilder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        public AccountBuilder accountAvatarId(int accountAvatarId) {
            this.accountAvatarId = accountAvatarId;
            return this;
        }

        public AccountBuilder accountEmail(String accountEmail) {
            this.accountEmail = accountEmail;
            return this;
        }

        public AccountBuilder accountPassword(String accountPassword) {
            this.accountPassword = accountPassword;
            return this;
        }

        public AccountBuilder characters(LinkedList<Character> characters) {
            this.characters = characters;
            return this;
        }

        public AccountBuilder accountSettings(AccountSettings accountSettings) {
            this.accountSettings = accountSettings;
            return this;
        }

        public Account build() {
            if (accountName.isEmpty()) {
                throw new IllegalStateException("Name cannot be empty");
            }

            if (accountEmail.isEmpty()) {
                throw new IllegalStateException("E-mail cannot be empty");
            }

            Account account = new Account();
            account.accountId = this.accountId;
            account.accountAvatarId = this.accountAvatarId;
            account.accountName = this.accountName;
            account.accountEmail = this.accountEmail;
            account.accountPassword = this.accountPassword;
            account.accountSettings = this.accountSettings;

            return account;
        }
    }
}
