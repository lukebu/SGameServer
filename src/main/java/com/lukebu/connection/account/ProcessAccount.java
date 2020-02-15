package com.lukebu.connection.account;
import com.lukebu.account.Account;
import com.lukebu.connection.Connector;

import java.sql.ResultSet;

public class ProcessAccount {

    private Account account;
    private ResultSet resultSet;
    private String status;
    private Connector connector = new Connector();

    private Account createAcc() {
        return account = Account.builder()
                .accountId(1)
                .buildAccount();
    }


    private String createAccount(Account account) {

        return status;
    }



}
