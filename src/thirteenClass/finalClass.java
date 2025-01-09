package thirteenClass;

public class finalClass {
    public static void main(String[] args) {
        try{
            System.out.println(1/ 0);
        } catch (Exception e){
            System.out.printf(".dd%s\n", e.getMessage());
        }finally {
            System.out.println("This block will always execute");
        }
    }
}
