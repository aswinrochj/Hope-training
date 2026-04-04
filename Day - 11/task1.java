public class Task1{
    public static void main(String[] args) {
        String s1="30";
        int num=Integer.parseInt(s1);
        System.out.println("Parsed integer: "+num);
        String s2="40.5";
        double d=Double.parseDouble(s2);
        System.out.println("Parsed double: "+d);
        String s3="B";
        char c1=s3.charAt(0);
        System.out.println("Parsed character: "+c1);
        Integer a=Integer.valueOf(10);
        Double b=Double.valueOf(20.5);
        Character c=Character.valueOf('A');
        System.out.println("Integer value: "+a.intValue());
        System.out.println("Double value: "+b.doubleValue());
        System.out.println("Character value: "+c.charValue());
        Integer x=Integer.valueOf(10);
        Integer y=Integer.valueOf(10);
        System.out.println("Equals check: "+x.equals(y));
        System.out.println("== check: "+(x==y));
        char ch='A';
        System.out.println("Is '"+ch+"' letter? "+Character.isLetter(ch));
        System.out.println("Is '"+ch+"' digit? "+Character.isDigit(ch));
        System.out.println("Integer toString: "+a.toString());
    }
}