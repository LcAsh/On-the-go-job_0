public class TestFruit {
   /* public static void main(String[] args) {
        Generator fg = new FruitGenerator<String>();
        for (int i = 0; i < 10; i++) {
            System.out.println(fg.next);
        }
    }*/
   public static void main (String[] args){
       Generator fg = new FruitGenerator<String>();
       for(int i=0;i<10;i++)
           System.out.println(((FruitGenerator) fg).next());
   }
}
