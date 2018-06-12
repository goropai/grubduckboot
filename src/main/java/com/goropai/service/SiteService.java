package com.goropai.service;

import com.goropai.model.Site;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SiteService {
    private static List<Site> websites = new ArrayList<>();
    static {
        websites.add(new Site("1", "2", "3", "4", "5"));
    }

    public List<Site> findAll() {
        return websites;
    }
}
