package com.lukebu.connection.character;

import com.lukebu.account.Account;
import com.lukebu.connection.Connector;

import java.sql.ResultSet;

public class ProcessCharacter {

    private Account account;
    private ResultSet resultSet;
    private String processStatus = "0";
    private Connector connector = new Connector();


    public String getCharacters(Account account) {
        this.account = account;
        connector.createConnectionToDb();
        String GET_CHARACTERS = "SELECT * FROM SGS_CHARACTERS WHERE (ACC_ID = "+ account.getAccountId() +");";
        resultSet = connector.insertQueryStatement(GET_CHARACTERS);
        System.out.println(resultSet);

        return processStatus;
    }


}
