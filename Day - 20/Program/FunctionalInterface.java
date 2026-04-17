import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;

public class FunctionalInterface
{
    public static void main(String[] args)
    {
        Predicate<Double> isEven = n -> n % 2 == 0;

        Consumer<String> val = name -> System.out.println(name);

        Supplier<Double> value = () -> 100.0;

        Double num = value.get();

        if(isEven.test(num))
        {
            val.accept("Number is even: " + num);
        }
        else{
            System.out.println("Number is odd");
        }
    }
}