public class defaultConstructor {
    public static void main(String[] args)
    {
        System.out.print("See the default constructor is created automatically while compilation");
        dConstruct dc = new dConstruct();
        dc.dconstruct();



    }
    
}

class dConstruct
{
    dconstruct(int x)
    {
        System.out.print("I am inside the parameterized constructor");
    }
}


//3 apartment fist has 1 bedroom, 1 kitchen, 1 public washroom, 1 hall, 1 kitchen and public playground and dinning hall----second has 2 bedrooms with attached washrooms, 1 pulblic hall for both, 2 kitchens, a public playground and dinning hall---- third has 4 bedrooms with attached 4 washrooms and each 2 bedroom as public hall, 1 public kitchen and one public playground and one dinning hall