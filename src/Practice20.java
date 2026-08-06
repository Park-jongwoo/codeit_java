public class Practice20 {

    public static void main(String[] args)
    {
        String email = "uh03053@gmail.com";
        int at = email.indexOf("@");

        String id = email.substring(0, at);
        System.out.println(id);



    }
}
