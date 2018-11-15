package com.company;

import java.util.Date;

class Employee extends Person
{
    protected String name, insuranceNumber;
    double salary;
    Date hireData;

    public Employee(String name, double salary, String insuranceNumber)
    {
        super(name);
        this.salary=salary;
        this.hireData=hireData;
        this.insuranceNumber=insuranceNumber;
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    public double getSalary()
    {
        return salary;
    }

    public String toString()
    {
        return super.toString()+" and my salary is "+getSalary();
    }
    public boolean equals(Object obj){
        Employee e = (Employee) obj;
        if (this==obj)
            return true;
        else if (!(obj instanceof Employee))
            return false;
        return (e.salary==salary);
    }
}
