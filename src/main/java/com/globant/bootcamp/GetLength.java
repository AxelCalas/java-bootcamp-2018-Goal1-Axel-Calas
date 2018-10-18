package com.globant.bootcamp;

public class GetLength {
    
    private String sentence;
    
    public GetLength(String sentence) {
        this.sentence = sentence;
    }
    
    public int get(){
        return sentence.length();
    }
}
