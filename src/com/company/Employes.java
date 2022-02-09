package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Employes {
    ArrayList<Employee> employees=new ArrayList<>();
    public void add(Employee employee){
        //добавление по алфавиту
        String[] g=new String[employees.size()+1];
        for (int i = 0; i <employees.size() ; i++) {
            g[i]=(employees.get(i)).getFam();
        }
        g[employees.size()]=employee.getFam();
        Arrays.sort(g);
        int b;
        for (int i = 0; i < g.length; i++) {
            if(g[i].equals(employee.getFam())){
                b=i;
                employees.add(b,employee);
                break;
            }
        }

    }
    public void print(){
        //печат списка
        for (int i = 0; i < employees.size(); i++) {
            Employee f=employees.get(i);
            System.out.println(f.toString());
        }
    }
    public void del(String tel){
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).tel.equals(tel)){
                employees.remove(i);
            }
        }
    }
    public void sortData(){
        employees.sort(new CompDate());
    }
    class CompDate implements Comparator<Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.compareTo(o2);
        }
    }
}
