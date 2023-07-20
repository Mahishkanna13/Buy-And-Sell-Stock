import java.util.Scanner;

public class Stocks {
    public static int Predict(int[] Array)
    {
        int min = Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<Array.length;i++)
        {
            if(min>Array[i])
            {
                min=Array[i];
                index=i;
            }
        }
        for(int i=index;i<Array.length;i++)
        {
            if(max<Array[i])
            {
                max=Array[i];
            }
        }
        return max-min;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Size= scanner.nextInt();
        int [] Array=new int[Size];
        for(int i=0;i<Size;i++)
        {
            Array[i]=scanner.nextInt();
        }
        System.out.println(Predict(Array));
    }
}
