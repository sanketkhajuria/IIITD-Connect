package com.example.iiitdconnect;

import java.util.Map;

public class categories {
    private Map<String, String> categories;
    public categories(Map<String, String> data){
        this.categories = data;
    }
    public categories(){}

    public Map<String, String> getCategories() {
        return this.categories;
    }

    public void setCategories(Map<String, String> categories) {
        this.categories = categories;
    }
}
