package org.example;

public class Dev {

    private Computer com;


    public Dev(){ //constructor
        System.out.println("Dev Constructor");
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build(){

        System.out.println("working on Awesome Project");
        com.compile();
    }
}
