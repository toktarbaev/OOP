package com.company;

class Person
{
    protected String name;

    public Person(String name)
    {
        this.name=name;
    }

    public String toString()
    {
        return "My name is " + name;
    }
    public boolean equals(Object obj)
    {
        Person p = (Person) obj;
        if (this==obj)
            return true;
        else if (!(obj instanceof Person))
            return false;
        return (p.name==name);
    }

}