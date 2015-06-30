public class regionMatches{
    public static void main(String args[]){
        String first_str = "Welcome to Microsoft";
        String second_str = "I work with microsoft";
        boolean match1 = first_str.regionMatches(11, second_str, 12, 9);
        boolean match2 = first_str.regionMatches(true, 11, second_str, 12, 9);//第一个参数true表示忽略大小写区别
        boolean isEqual1 = first_str.equals(second_str);
        boolean isEqual2 = "abc".equals("abc");
        System.out.println("区分大小写返回值：" + match1);
        System.out.println("不区分大小写返回值：" + match2);
        System.out.println("是否相等的返回值：" + isEqual1);
        System.out.println("是否相等的返回值：" + isEqual2);
    }
}