
public class Test {

    @testInterface(test = "测试")
    public static String test(String text){
        return text;
    }
    public static void main(String[]args){
        System.out.println(test("te"));
    }
}
