package com.lukebu.account;

import com.lukebu.connection.Connector;

public class CreateNewAccount {

    private Account account;

    private Account createAccount() {
        return account = Account.builder()
                .accountId(1)
                .accountName("Buba")
                .accountAvatarId(1)
                .accountEmail("aaaa@bbb.pl")
                .accountPassword("PASS")
                .build();
    }

    public static void main(String[] args) {
        Connector connector = new Connector();
        connector.createConnectionToDb();

    }
}
