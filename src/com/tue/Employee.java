package com.tue;

public class Employee extends Person {
    private String companyName;

    public String jobDescription()
    {
        return this.getName() + "is working at " + this.companyName;
    }
}
