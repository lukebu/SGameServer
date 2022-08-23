package com.lukebu.sgs.session;

import com.lukebu.sgs.model.account.Account;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class SessionObject {

    private Account account = null;

    public boolean isLogged() {
        return account != null;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
