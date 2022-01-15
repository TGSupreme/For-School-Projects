class FixedDeposit
{
    double P, R, N;

    void input(double pa, double ri, double ny)
    {
        P=pa;
        R=ri;
        N=ny;
    }
    double interest()
    {
        return(((P*R*N)/1000+P));
    }
    void output()
    {
        System.out.println("\n Prinipal Amount Rs.: " +P);
        System.out.println("\n Rat Of Interest Is: " +R);
        System.out.println("\n Number Of Year Is: " +N);

    }
}
class FixedDepositeDemo
{
    public static void main (String args[])
    {
        FixedDeposit f1=new FixedDeposit();
        FixedDeposit f2=new FixedDeposit();

        f1.input(1000, 5, 3);
        f2.input(2000, 10, 6);

        f1.output();
        System.out.println("total amount is rs. " +f1.interest());

        f2.output();
        System.out.println("total amount is rs. " +f2.interest());
    }

}