public class Practice16 {

    public static void main(String[] args)
    {
        int num[] = {1, 5, 15, 13, 8};

        int find = 10;

        boolean fact = false;

        for (int i = 0; i < num.length; i++)
        {
            if(num[i] == find)
            {
                fact = true;
                break;
            }



        }

        if (fact)
        {
            System.out.println("있습니다.");
        }

        else
        {
            System.out.println("없습니다.");
        }
    }
}
