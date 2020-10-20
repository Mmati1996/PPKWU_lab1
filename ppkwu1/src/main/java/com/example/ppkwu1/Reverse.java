package com.example.ppkwu1;

public class Reverse {
    private final String text;

    public Reverse(String text){
        this.text = new StringBuilder(text).reverse().toString();
    }

    public String getText(){
        return text;
    }
}
