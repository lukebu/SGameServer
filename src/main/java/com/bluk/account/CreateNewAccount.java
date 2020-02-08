package com.bluk.account;

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
        CreateNewAccount createNewAccount = new CreateNewAccount();
        createNewAccount.createAccount();
        System.out.println(createNewAccount.account.getAccountName());
    }






}
