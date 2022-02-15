package com.coderluka.recipe.RecipeApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControler
{
@RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        return "index";
    }
}
