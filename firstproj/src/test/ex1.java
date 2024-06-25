package test;

public class ex1 extends abc
{
    void meth()
    {
        System.out.println("hi");
    }
    
    public static void main(String[] args) 
    {
        ex1 a=new ex1();
        a.meth();
        
    }    
}

abstract class abc
{
    abstract void meth();
}
