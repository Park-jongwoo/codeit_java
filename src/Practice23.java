public class Practice23 {

    public static void main(String[] args)
    {
        String csv = "apple,banana,cherry";

        String[] fruits = csv.split(",");

        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
