import java.util.Scanner;

public class BankSimulator {
    public static void display(){
        System.out.println("**************************");
        System.out.println("1. Check your balance.");
        System.out.println("2. Make a withdrawal.");
        System.out.println("3. Make a deposit.");
        System.out.println("4. Exit the program. ");
        System.out.println("Choose your option: ");

    }

    public static void main(String[] args) {
        System.out.println("**********Bank Simulator*******");
        System.out.println("1. Check your balance.");
        System.out.println("2. Make a withdrawal.");
        System.out.println("3. Make a deposit.");
        System.out.println("4. Exit the program. ");
        System.out.println("Choose your option: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        //initial balance=$300
        double initial_balance=300;
        //changes= remaining money after deposit,withdrawal
        double changes=300;
double current_balance=300;
        if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {




                while (choice != 4) {

                    if (choice == 1) {
                        current_balance = changes;
                        System.out.println("Your balance is $ : " + current_balance);
                        display();
                        choice = input.nextInt();
                    } else if (choice == 2) {


                        System.out.println("Enter the amount of money you want to withdrawal: ");
                        Scanner input_withdrawal = new Scanner(System.in);
                        double withdrawal = input_withdrawal.nextDouble();

                        if(withdrawal<current_balance && current_balance>=30){

                        System.out.println("You take $ " + withdrawal + " from your balance: $"+current_balance);
                        changes = current_balance - withdrawal;

                        //calling a method
                        display();
                        choice = input.nextInt();}

                        else {
                            System.out.println("Sorry you don't have enough balance or Transaction can't be done when the amount is below $30.");
                            System.out.println("Your balances is $ "+current_balance);
                            display();
                            choice = input.nextInt();

                        }

                    } else if (choice == 3) {

                        System.out.println("Enter the amount of money you want to add: ");
                        Scanner input_add = new Scanner(System.in);
                        double deposit = input_add.nextDouble();
                        changes = current_balance + deposit;
                        System.out.println("You add $: " + deposit + " to your balance: $"+current_balance);
                        display();
                        choice = input.nextInt();

                    }
                }
            }
        else {
            System.out.println("Please enter number between 1 to 4. Thank you. ");
        }

        }
}

