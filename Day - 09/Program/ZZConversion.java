import java.util.Scanner;

class ZZCoversion
{
    public static String ZigZag(String str, int numRows)
    {
        int curRow = 0;
        boolean flag = false;

        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i = 0;i<numRows;i++)
        {
            rows[i] = new StringBuilder();
        }
        for(char c:str.toCharArray())
        {
            rows[curRow].append(c);
            if(curRow == 0 || curRow == numRows - 1)
            {
                flag = !flag;
            }

            curRow += flag?1:-1;
        }

        StringBuilder res = new StringBuilder();

        for(StringBuilder row : rows)
        {
            res.append(row);
        }



        return res.toString();
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int numRows = input.nextInt();
        System.out.println(ZigZag(str, numRows));

        
    }
    
}