package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        Employes e=new Employes();

        Employee employee=new Employee("Max" ,"Rubcov", "86749", 20,2, 2007);
        Employee employee1=new Employee("Ira","Rubcova","86453",6,1,1980);
        e.add(employee);
        e.add(employee1);
        e.print();
        e.sortData();
        e.print();
        e.del("86453");
        e.print();

    }
}
