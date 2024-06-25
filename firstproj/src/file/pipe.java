package file;
import java.io.*;

class Producer extends Thread
{
    OutputStream os;
    Producer(OutputStream o)
    {
        os=o;
    }
   synchronized public void run()
    {
        int count=1;
        try 
        {
           while(true)
           {
            os.write(count); 
            os.flush();  
            count++;
            System.out.println("producer "+count);
            System.out.flush();
            Thread.sleep(1000);
           }
          
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

class Consumer extends Thread
{
    InputStream is;
    Consumer(InputStream i)
    {
        is=i;
    }
   synchronized public void run() 
    {
       try
       {
        int x;
        while(true)
       {
        x= is.read();
        System.out.println("consumer "+x);
        System.out.flush();
        Thread.sleep(1000);
       }
      
    }
       catch(Exception e){}
    }
}
public class pipe 
{
    public static void main(String[] args) throws Exception
    {
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();
        Producer p=new Producer(pos);
        Consumer c=new Consumer(pis);
        pos.connect(pis);
        p.start();
        c.start();    
    }
}
