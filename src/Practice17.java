public class Practice17 {

    public static void main(String[] args)
    {
        int num[][] =
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}

                };
        int sum = 0;
        for ( int i = 0; i<num.length; i++)
        {
            for(int z = 0; z<num[i].length; z++)
            {
                sum += num[i][z];
            }
        }

        System.out.println(sum);
    }

}
