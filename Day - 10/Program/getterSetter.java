class Name
{
    private String name;
    public void setName(String name)
    {
        this.name = name;
    }
    public void getName()
    {
        //return this.name;
        System.out.println(this.name);
    }
}

public class getterSetter
{
    public static void main(String[] args)
    {
        Name n = new Name();
        n.setName("Reno");
        n.getName();
    }
}