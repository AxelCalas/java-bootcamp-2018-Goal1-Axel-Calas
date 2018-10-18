package com.globant.bootcamp;

public class App 
{
    public static void main( String[] args )
    {
        String sentence = "Hello Word!";
        
        System.out.println( "Hello! \n" );
        
        GetLength getLenght = new GetLength(sentence);
        int lenght = getLenght.get();
        
        System.out.println("The sentence \"" + sentence + "\" has " + lenght + " characters");
        
    }
}
