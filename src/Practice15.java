public class Practice15 {


    public static void main(String[] args)
    {
        int num[] = {1, 5, 10, 4, 8};

        for(int i = 0; i < num.length; i++)
        {
            num[i] = num[i] * 2;
        }


        for (int number : num) {
            System.out.println(number);
        }
    }
}
