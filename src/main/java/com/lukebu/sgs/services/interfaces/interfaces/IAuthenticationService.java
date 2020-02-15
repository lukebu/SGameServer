package com.lukebu.sgs.services.interfaces.interfaces;

public interface IAuthenticationService {

    void authenticate(String login, String password);
    void logout();

}
