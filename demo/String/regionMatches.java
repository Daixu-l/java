public class regionMatches{
    public static void main(String args[]){
        String first_str = "Welcome to Microsoft";
        String second_str = "I work with microsoft";
        boolean match1 = first_str.regionMatches(11, second_str, 12, 9);
        boolean match2 = first_str.regionMatches(true, 11, second_str, 12, 9);//��һ������true��ʾ���Դ�Сд����
        boolean isEqual1 = first_str.equals(second_str);
        boolean isEqual2 = "abc".equals("abc");
        System.out.println("���ִ�Сд����ֵ��" + match1);
        System.out.println("�����ִ�Сд����ֵ��" + match2);
        System.out.println("�Ƿ���ȵķ���ֵ��" + isEqual1);
        System.out.println("�Ƿ���ȵķ���ֵ��" + isEqual2);
    }
}