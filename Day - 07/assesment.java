import java.util.Scanner;

class assesment
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        int len = str.length();
        int count = 0;

        for(int i = 0;i<len-1;i++)
        {
            if((str.charAt(i)!=' ') && (str.charAt(i+1) == ' '))
            {
                count++;

            }

        }
        if(len>0 && str.charAt(len-1) != ' ')
        {
            count++;
        }
        input.close();

        System.out.println("The count of the words is " + count);


    }
}