package com.lukebu.sgs.services.impl.accounts;

import com.lukebu.sgs.database.IAccountDAO;
import com.lukebu.sgs.model.account.Account;
import com.lukebu.sgs.services.interfaces.accounts.IAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthenticationService implements IAuthenticationService {

    @Autowired
    IAccountDAO accountDAO;

    @Override
    public void authenticate(String accountName, String accountPassword) {
        Optional<Account> account = this.accountDAO.getUserByLogin(accountName);
    }

    @Override
    public void logout() {
        //TODO
    }




}
