package com.goropai.controllers;

import com.goropai.model.Site;
import com.goropai.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SiteListController {
    @Autowired
    private SiteService siteService;

    @RequestMapping("/api/sites")
    public List<Site> getListOfProviders() {
        return siteService.findAll();
    }
}
