public class Main {
    public static void main(String[] args) throws Exception{
        int i=0;
        while (i<2){
            int byteIn = System.in.read();
            System.out.println(byteIn);
            i++;
        }
    }
}