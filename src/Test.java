/**
 * Created by tzy on 2017/10/6.
 */
public class Test {
    public static void main(String[] args) {
        A classa=new A("he");
        A classb=new A("he");
        System.out.println(classa==classb);
        System.out.println(classa.equals(classb));
    }
    static class A{
        public A(String string){

        }
    }
}
