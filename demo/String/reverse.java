public class reverse{
    public static void main(String args[]){
        String str = "abcdef";
        StringBuffer reverse = new StringBuffer(str);
        reverse.reverse().toString();
        System.out.println("\nString before reverse:"+str);
        System.out.println("String after reverse:"+reverse);
    }
}