class OutLine
{
    static void printline()
    {
        for(int i=0; i<60; i++)
            System.out.print('@');
            System.out.println();         
    }
    static void printline(int n)
    {
        for(int i=0; i<n; i++)
            System.out.print('%');
            System.out.println();
    }
    static void printline(char ch, int n)
    {
        for (int i=0; i<n; i++)
            System.out.print(ch);
            System.out.println();
    }
}
public class OutlineDemo12B01
{
    public static void main(String[] s)
    {
        OutLine.printline();
        OutLine.printline(30);
        OutLine.printline('A',20);
    }
}