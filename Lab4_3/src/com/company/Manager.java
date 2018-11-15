package com.company;

import java.util.Date;

class Manager extends Employee implements Comperable
{
    protected String name, insuranceNumber;
    double salary, bonus;
    Date hireData;

    public Manager(String name, double salary, String insuranceNumber, double bonus)
    {
        super(name, salary, insuranceNumber);
        this.bonus=bonus;
    }

    public void setInsuranceNumber(String insuranceNumber)
    {
        this.insuranceNumber=insuranceNumber;
    }
    public String getInsuranceNumber()
    {
        return insuranceNumber;
    }

    @Override
    public String toString()
    {
        return super.toString()+" and bonus is "+this.bonus;
    }

    @Override
    public boolean equals(Object obj)
    {
        Manager m = (Manager) obj;
        if (this==obj)
            return true;
        else if (!(obj instanceof Manager))
            return false;
        return (m.bonus==bonus);
    }

    @Override
    public boolean CompareTo(Object otherObject)
    {
        Manager man = (Manager) otherObject;
        if (man.salary>this.salary)
            System.out.println(man.name+"'s salary is more");
        else if (salary>man.salary)
            System.out.println(this.name+"'s salary is more");
        else
        {
            if (man.bonus>this.bonus)
                System.out.println(man.name+"'s bonus is more");
            else
                System.out.println(this.name+"'s bonus is more");
        }
        return true;
    }
}