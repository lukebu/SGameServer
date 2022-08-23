package com.lukebu.sgs.database;

import com.lukebu.sgs.model.account.Account;

import java.util.Optional;

public interface IAccountDAO {
    Optional<Account> getUserByLogin(String accountName);
}
