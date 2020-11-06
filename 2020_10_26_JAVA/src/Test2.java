import java.security.cert.Extension;

public class Test2 extends Exception{
    private int detail;
    public Test2(String msg){
        super(msg + "数据范围不对!");
    }
    /*public String toString(){
        return "数据范围有问题啊！"+detail;
    }*/
}
