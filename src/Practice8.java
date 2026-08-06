public class Practice8 {

    public static void main(String[] args) {

        int result = 0;
        int i = 0;
        while(i <= 50)
        {
            if(i % 3 != 0)
            {
                i++;
                continue;
            }
            result += i ;
            i++;

       }

        System.out.println("3의 배수 합 : " + result);


    }

}

