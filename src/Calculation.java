public class Calculation
{
    int num1, num2, num3;

     Calculation(int x, int y, int z)
    {
        num1=x;
        num2=y;
        num3=z;
    }
    void sum()
    {
        System.out.println("Sum = " + (num1+num2+num3));

    }

    public static void main(String[] args)
    {
        Calculation cal = new Calculation(10,20,30);
        cal.sum();

    }
}
