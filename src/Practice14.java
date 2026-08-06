public class Practice14 {

    public static void main(String[] args)
    {
        int a[] = {15, 10, 8, 32, 17};

         int max = a[0];

         for(int i = 0; i < a.length; i++)
         {
             if( max < a[i])
             {
                 max = a[i];
             }
         }

         System.out.println("가장 큰수는 : "+ max);


    }
}
