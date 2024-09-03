class Employee
{
    float salary = 40000;
}
class Programmer extends Employee
{
    int bonus = 10000;
}
public class Inheritance
{
    public static void main(String args[])
    {
        Programmer p = new Programmer();
        System.out.printf("Salary: %.0f\nBonus: %d\nTotal: %.0f",p.salary,p.bonus,p.salary+p.bonus);
    }
}

