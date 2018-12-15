using System;

public class Properties
{
    public string FirstName { get; set; }
    public string LastName { get; set; }
    public string Departement { get; set; }
}

public class Test 
{
    static void Main(string[] args){
        var person = new Properties{FirstName = "Lydia", LastName="Solomon", Departement="Software"};
        Console.WriteLine($"{person.FirstName}  {person.LastName} \n {person.Departement}")
    }
}