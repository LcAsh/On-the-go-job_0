/*import java.util.Random;

public class FruitGenerator<T> implements Generator<String>{
    private String[] fruits = new String[]{"Apple","Banana","Pear"};

    public String next(){
        // TODO Auto-generated method stub
        Random rm = new Random();
        return  fruits [rm.nextInt(fruits.length)];
    }

    *//*@Override
    public String Text() {
        return null;
    }*//*
}*/
import java.util.Random;

public class FruitGenerator <T> implements Generator<String> {

    private String[] fruits = new String[]{"apple","banana","peach"};

    public String next() {
        // TODO Auto-generated method stub
        Random rm = new Random();
        return fruits[rm.nextInt(fruits.length)];
    }


    @Override
    public String Text() {
        return null;
    }
}
