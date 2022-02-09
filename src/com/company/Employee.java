package com.company;

public class Employee implements Comparable<Employee> {
    String name;
    String fam;
    String tel;
    int number;
    int month;
    int year;

    public Employee(String name,String fam,String tel,int number,int month,int year) {
        this.name = name;
        this.fam=fam;
        this.tel=tel;
        this.number=number;
        this.month=month;
        this.year=year;
    }

    @Override
    public boolean equals(Object obj) {
        Employee obj1=(Employee) obj;
        return name.equals(((Employee)obj).name);
    }

    @Override
    public String toString() {
        String num=Integer.toString(number);
        String month1=Integer.toString(month);
        String year1=Integer.toString(year);
        return "name: "+name+"\n"+"surname: "+fam+"\n"+tel+"\n"+num+"."+month1+"."+year1+"\n";
    }

    @Override
    public int compareTo(Employee o) {
        if(this.year>o.year){
            if(this.month>o.month){
                if(this.number>o.number){
                    return 1;
                }else if(this.number<o.number){
                    return -1;
                }else{
                    return 0;
                }
            }else if(this.month<o.month){
                return -1;
            }else{
                return 0;
            }
        }else if(this.year<o.year){
            return -1;
        }
        return 0;
    }

    public String getFam() {
        return fam;
    }
}
