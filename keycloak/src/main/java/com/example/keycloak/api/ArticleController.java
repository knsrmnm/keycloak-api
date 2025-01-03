package com.example.keycloak.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/articles")
public class ArticleController {

    @GetMapping("/free")
    public String getFreeArticle() {
        return "free article";
    }

    @GetMapping("/premium")
    public String getPremiumArticle() {
        return "premium article";
    }
}
