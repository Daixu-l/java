public class SearchlastString{
    public static void main(String args[]){
        String strOri = "Hello World,Hello Reader";
        int lastIndex = strOri.lastIndexOf("Hello");
        if(lastIndex  == -1){
        	System.out.println("Hello not found");
        }else{
        	System.out.println("Last occurrence of Hello is at index "+lastIndex);
        }
    }
}