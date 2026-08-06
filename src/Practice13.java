public class Practice13
{

    public static void main(String[] args)
    {
        int a[] = {5,7,10, 3, 7};
        int sum = 0;


        for(int ab  : a )
        {
            sum += ab;
        }

        double average = (double) sum / a.length;
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + average);



    }
}
