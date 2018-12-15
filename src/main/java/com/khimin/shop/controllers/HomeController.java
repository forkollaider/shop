package com.khimin.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * Created by tikhon on 11/15/18.
 */
@Controller
public class HomeController {
    @RequestMapping("/default")
    public String defaultAfterLogin(HttpServletRequest request) {

        return "redirect:/products";
    }


}
