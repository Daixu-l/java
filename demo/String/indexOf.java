public class indexOf{
    public static void main(String args[]){
        String str = "Hello readers";
        int intIndex = str.indexOf("Hello");
        if(intIndex == -1){
        	System.out.println("Hello not found");
        }else{
        	System.out.println("Found Hello at index "+intIndex);
        }
    }
}