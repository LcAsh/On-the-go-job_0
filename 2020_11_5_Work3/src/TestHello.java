import java.util.HashMap;
import java.util.Map;

public class TestHello {
    //泛型
    public static <T> void DisplayArray(T[] anArray)//T为泛型，Disp显示各种各样的数组
    {
        for(T t:anArray)
        {
            System.out.println(t);  //默认调用了to String，逐个输出
            System.out.println("----");
        }
    }

    public static void main (String[] args){
       /* String[] strArray = {"ABC","ABD","ABE"};//String类型
        DisplayArray(strArray);

        Integer[] intArray={1,2,3,4,5};//Integer类型,和String都是类类型
        DisplayArray(intArray);

        Car [] carArray = new Car[2];//数组类型
        carArray[0] = new Car("奔驰",3,4);
        carArray[1] = new Car("宝马",2,4);
        DisplayArray(carArray);*/
        Map<Integer,String> map = new HashMap<>();//泛型
        map.put(2, "ABC");
        map.put(4, "8868");
        System.out.println(map.get(4));//从4中直接拧出来的

        Map<String,Car> carmap = new HashMap<String,Car>();
        carmap.put("奔驰", new Car("奔驰",3,4));
        carmap.put("宝马", new Car("宝马",1,3));
        System.out.println(carmap.get("奔驰"));//按K值元素取唯一值，即第一个值
        System.out.println(carmap.size());
    }
}