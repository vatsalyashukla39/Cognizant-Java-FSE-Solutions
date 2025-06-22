public class Test {
    public static void main(String[] args) {
        Logger l1=Logger.getInstance();
        Logger l2=Logger.getInstance();
        l1.log("Logger 1");
        l2.log("Logger 2");

        if(l1.hashCode()==l2.hashCode()){
            System.out.println("Logger 1 and Logger 2 are the same");
        }
        else System.out.println("Logger 1 and Logger 2 are not the same");
    }
}
