class thread1 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<=10;i++)
            {
                for(int j=10-1;j>=i;j--)
                {
                    System.out.print(" ");
                }
                for(int j=0;j<=i;j++)
                {
                    System.out.print("* ");
                    sleep(100);
                }
                System.out.println();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Star_with_sleep
{
    public static void main(String[] args) {
        thread1 th1=new thread1();
        th1.start();
    }
}
