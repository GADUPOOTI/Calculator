public class Calculator
{
public int hands = 2;
public int fingers = 20;

public void ear()
{
System.out.println("ear");
}
public void straitfingers()
{
System.out.println("straitfingers");
}
public int sum(int a = 10, int b = 20)
{
return a + b;
}
public int sub(int a, int b)
{
return a - b;
}
public int div(int a, int b)
{
return a / b;
}
public int mul(int a, int b)
{
return a * b;
}
}

class Test
{
public static void main(String args[])
{
Calculator calculator = new Calculator();
System.out.println("calculator hands");
System.out.println("calculator fingers");
calculator.ear();
calculator.straitfingers();
System.out.println("sum +a and b is" +calculator.sum(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
System.out.println("sub +a and b is" +calculator.sub(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
System.out.println("div +a and b is" +calculator.div(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
System.out.println("mul +a and b is" +calculator.mul(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
System.out.println("Test");
}
}


