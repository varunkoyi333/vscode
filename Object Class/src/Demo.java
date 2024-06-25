public class Demo extends Object
{
    int x,y;
    String Name;
    
    public static void main(String[] args) {
        Demo d=new Demo(); 
        Demo d2=new Demo();
        d.x=10;
        d.y=20;
        d.Name="Deepak";
        d2.x=10;
        d2.y=20;
        d2.Name="Deepak";
        // System.out.println(d.toString());
        // System.out.println(d.equals(d2));
        Object o=new Demo();
        System.out.println(o.getClass());
    }

    public String toString()
    {
        return "x : "+x+"\ny : "+y+"\nName : "+Name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        result = prime * result + ((Name == null) ? 0 : Name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Demo other = (Demo) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        if (Name == null) {
            if (other.Name != null)
                return false;
        } else if (!Name.equals(other.Name))
            return false;
        return true;
    }    

    // public boolean equals(Demo that)
    // {
    //     return this.x==that.x && this.y==that.y && this.Name.equals(that.Name);
    // }

}