package com.company;

import java.util.*;

class Rectangle{
    //old method
    @Deprecated
    public void showNameOfClass(){
        System.out.println("Rect");
    }

    public void printNameOfClass(){
        System.out.println("Rectangle");
    }
}


public class Annotation{
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.showNameOfClass();
        r.printNameOfClass();
    }
}