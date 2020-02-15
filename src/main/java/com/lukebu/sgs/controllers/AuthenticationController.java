package com.lukebu.sgs.controllers;

import com.lukebu.sgs.services.interfaces.interfaces.IAuthenticationService;
import com.lukebu.sgs.session.SessionObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class AuthenticationController {
    @Resource
    SessionObject sessionObject;

    @Autowired
    IAuthenticationService authenticationService;






}