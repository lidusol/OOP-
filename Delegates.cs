using System;

delegate int ChangeValue(int number);

class Delegates
{
    static int num = 25;

    static int increment(int value)
    {
        return num + value;
    }
    static in decrement(int value)
    {
        return num - value;
    }
    static int getValue()
    {
        return num;
    }
    

    static void Main(string[] args){
        ChangeValue changeValue1 = new ChangeValue(increment);
        ChangeValue changeValue2 = new ChangeValue(decrement);

        changeValue1(10);
        Console.WriteLine("The value of the number is {0}", getValue());
        changeValue2(15);
         Console.WriteLine("The value of the number is {0}", getValue());

    }
}