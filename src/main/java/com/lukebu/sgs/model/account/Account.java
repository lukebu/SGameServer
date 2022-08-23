package com.lukebu.sgs.model.account;
import javax.persistence.*;

@Entity(name = "SGS_USERS")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACC_ID")
    private int accountId;
    @Column(name = "ACC_NAME")
    private String accountName;
    @Column(name = "ACC_AVATAR_ID")
    private int avatarId;
    @Column(name = "ACC_COUNTRY_CODE")
    private String countryCode;
    @Column(name = "ACC_EMAIL")
    private String accountEmail;
    @Column(name = "ACC_PASSWORD")
    private String accountPassword;

    private Account(){
    }

    public Account(int accountId, String accountName, int avatarId, String countryCode, String accountEmail, String accountPassword) {

        this.accountId = accountId;
        this.accountName = accountName;
        this.avatarId = avatarId;
        this.countryCode = countryCode;
        this.accountEmail = accountEmail;
        this.accountPassword = accountPassword;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(int avatarId) {
        this.avatarId = avatarId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }
}
