using System;

class FirstClass
{
   public virtual void printSomething() { Console.WriteLine("First class virtual method"); }
}
class SecondClass: FirstClass
{
   public override void printSomething() { Console.WriteLine("Second class method that overrides the virtual method"); }
}

class Test
{
   static void Main() {
      SecondClass secondClass = new SecondClass();
      secondClass.printSomething();
   }
} 