/**
 * Created by tzy on 2017/10/6.
 */
public class Main {
    public static void main(String[] args)throws Exception {
        byte[] src="yu".getBytes();
        byte[] dst;
        dst=new String(src,"UTF-8").getBytes("GBK");
        System.out.println(dst.length);
        for (byte b:dst) {
            System.out.print(b+" ");
        }
    }
}
