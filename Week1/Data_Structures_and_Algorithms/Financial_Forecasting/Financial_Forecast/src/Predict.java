import java.util.Scanner;

public class Predict {
    public static double predict(double amount,double growthRate,int years) {
        if(years==0) return amount;
        return predict(amount+amount*growthRate,growthRate,years-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int years = sc.nextInt();
        double amount = sc.nextDouble();
        double growthRate = sc.nextDouble();
        sc.close();
        System.out.println(predict(amount,growthRate,years));
    }
}
