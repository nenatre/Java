import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        double total = 0;
        while (!input.equals("NoMoreMoney")){
            double money = Double.parseDouble(input);
            if (money<0){
                System.out.println("Invalid operation!");
                break;
            }
            total +=money;
            System.out.printf("Increase: %.2f%n",money);
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f",total);
    }
}
