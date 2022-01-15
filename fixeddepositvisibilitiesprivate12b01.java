class FixedDeposit
{
    private float P, R, N;
        FixedDeposit(float pa,float ri, float ny)
        {
            P=pa;
            R=ri;
            N=ny;
        }
    double interest()
    {
      return(((P*R*N)/100)+P);  
    }
void output()
    {
        System.out.println("/n Principal Amount Is ₹ :"+P);
        System.out.println("/n Rate Of Interest Is  :"+R);
        System.out.println("/n Principal Amount Is ₹ :"+N);
    }
        double getPa()
        {
            return P;
        }
        double getRi()
        {
            return R;
        }
        double getNy()
        {
            return N;
        }
}
class fixeddepositvisibilitiesprivate12b01
{
    public static void main(String []args)
        {
            FixedDeposit fd1=new FixedDeposit(100, 5, 3);
            FixedDeposit fd2=new FixedDeposit(200, 5, 3);

            fd1.output();
            System.out.println("/n Interest Amout Is ₹"+fd1) ;

            fd2.output();
            System.out.println("/n Interest Amout Is ₹"+fd2);
        }
}
    

