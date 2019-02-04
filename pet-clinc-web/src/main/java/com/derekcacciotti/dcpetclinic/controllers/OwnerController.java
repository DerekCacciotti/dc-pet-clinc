package com.derekcacciotti.dcpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"/owners", "/owners/index.html"})
    public String listOwners()
    {
        return "owners/index";
    }
}
