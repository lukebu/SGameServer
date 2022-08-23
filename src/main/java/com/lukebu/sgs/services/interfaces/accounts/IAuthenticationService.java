package com.lukebu.sgs.services.interfaces.accounts;

public interface IAuthenticationService {

    void authenticate(String login, String password);
    void logout();

}
