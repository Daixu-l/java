public class split{
    public static void main(String args[]){
        String str = "jan-feb-march-a-b-c";
        String[] temp;
        String delimeter = "-";
        temp = str.split(delimeter);
        for(int i =0; i < temp.length ; i++){
        	System.out.println(temp[i]);
        	System.out.println("");
        }
        temp = str.split(delimeter,4);
        for(int i=0; i < temp.length ; i++){
        	System.out.println(temp[i]);
        	System.out.println("");
        }
    }
}