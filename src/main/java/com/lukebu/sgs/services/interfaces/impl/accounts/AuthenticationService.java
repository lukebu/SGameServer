package com.lukebu.sgs.services.interfaces.impl.accounts;

import com.lukebu.sgs.database.IAccountDAO;
import com.lukebu.sgs.services.interfaces.interfaces.IAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements IAuthenticationService {

    @Autowired
    IAccountDAO accountDAO;

    @Override
    public void authenticate(String login, String password) {
        //TODO
    }

    @Override
    public void logout() {
        //TODO
    }




}
