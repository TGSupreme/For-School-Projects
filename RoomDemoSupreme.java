class Room 
{
    float length, width, height;
    byte nwindows;

    public Room() {
    }
    void setAttr(float l, float w, float h, byte n)
    {
        length=l;
        width=w;
        height=h;
        nwindows=n;
    }
    double area()
    {
       return(length * width);

    }
    void display()
    {
        System.out.println("\nLength:" +length);
        System.out.println("\nWidth:" +width);
        System.out.println("\nHeight:" +height);
        System.out.println("\nNumbers Of Windows:" +nwindows);
    
    }
}
class RoomDemoSupreme 
    {
       public static void main(String args[])
    {
        Room r1=new Room();
        Room r2=new Room();

        r1.setAttr(18,12.5f,10,(byte)2);
        r2.setAttr(13,10.5f,15,(byte)1);

        r1.display();
        System.out.println( "\nArea Of Object 1 Is:"+r1.area());
        
        r2.display();
        System.out.println( "\nArea Of Object 2 Is:"+r2.area());
    }
}