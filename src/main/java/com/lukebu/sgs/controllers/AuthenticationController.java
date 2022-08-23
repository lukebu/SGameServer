package com.lukebu.sgs.controllers;

import com.lukebu.sgs.model.account.Account;
import com.lukebu.sgs.services.interfaces.accounts.IAuthenticationService;
import com.lukebu.sgs.session.SessionObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class AuthenticationController {

    @Resource
    SessionObject sessionObject;

    @Autowired
    IAuthenticationService authenticationService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loadLoginForm(Model model) {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute Account account) {
        this.authenticationService.authenticate(account.getAccountName(), account.getAccountPassword());
        if(this.sessionObject.isLogged()) {
            return "redirect:/main";
        }
        return "redirect:/login";
    }
}