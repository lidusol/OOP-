using System;

interface Iinterface
{
    void displaySomething();
}

class Interface : Iinterface
{
    public void displaySomething("Method implementing the interface's method"){

    }

    public static void Main(String[] args){
        Interface i = new Interface();
        i.displaySomething();
    }
}
