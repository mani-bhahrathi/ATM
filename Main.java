import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        access ac=new access();
        ac.add();
    }
}
class access{
    long amount=0;
//    int[]pin=new int[4];
    void add() {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|=====================|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|\t\tTERV-ATM\t  |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|=====================|");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pin: ");
        int userinput=sc.nextInt();
//        if (userinput >=0000 && userinput <=9999) {
//            for (int i = 4; i > 0; i--) {
//                pin[i] = userinput % 10;
//                userinput /= 10;
//            }
//            System.out.println("Account Successfully Login");
//            for (int digit : pin) {
//                System.out.print(digit);
//            }
//        }
//        else {
//            System.out.println("Invalid pin. Please enter a 4 digit pin");
//        }
        System.out.println("--------------------------------------");
        System.out.println("\t\t\t🙏Welcome🙏");
        System.out.println("--------------------------------------");
        System.out.println("1) Current Account");
        System.out.println("2) Saving Account");
        System.out.print("Select Your Account Type: ");
        int AC_Type = sc.nextInt();
        if (AC_Type == 1) {
            System.out.println("------------------------------");
            System.out.println("You selected Current Account!");
            System.out.println("------------------------------");
            System.out.println("1) Deposit");
            System.out.println("2) Withdraw");
            System.out.println("3) Balance Enquiry");
            System.out.print("Select Your Process: ");
            long Process = sc.nextInt();
            if (Process == 1) {
                System.out.println("------------------------");
                System.out.println("You Selected Deposit!");
                System.out.println("------------------------");
                System.out.print("Enter Deposit Amount: ");
                long Deposit = sc.nextInt();
                amount=amount+Deposit;
                System.out.println("Amount ₹" + Deposit + " Is Deposited To Your Account Successfully");
                System.out.println("1) Continue");
                System.out.println("2) Exit\n");
                System.out.print("   Enter: ");
                int CNE = sc.nextInt();
                if (CNE == 1) {
                    add();
                }
            } else if (Process == 2) {
                System.out.println("------------------------");
                System.out.println("You Selected Withdraw!");
                System.out.println("------------------------");
                System.out.print("Enter Amount: ");
                long Withdraw = sc.nextInt();
                for (int i = 0; i < 1; i++) {
                    if (Withdraw <= amount) {
                        System.out.println("Amount Withdraw " + Withdraw);
                        amount= amount-Withdraw;
                        System.out.println("Your Balance Amount: "+amount);
                        System.out.println("1) Continue");
                        System.out.println("2) Exit\n");
                        System.out.print("   Enter: ");
                        int abc = sc.nextInt();
                        if (abc == 1) {
                            add();
                        }
                    } else {
                        System.out.println("\n# Insufficient Amount ⚠️\n");
                        System.out.println("1) Continue");
                        System.out.println("2) Exit\n");
                        System.out.print("   Enter: ");
                        int abc = sc.nextInt();
                        if (abc == 1) {
                            add();
                        }
                    }
                }
            }
            else if (Process == 3){
                System.out.println("---------------------------------");
                System.out.println("You Selected Balance Enquiry!");
                System.out.println("---------------------------------");
                System.out.println("Your Balance Amount Is: "+amount);
                System.out.println("1) Continue");
                System.out.println("2) Exit\n");
                System.out.print("   Enter: ");
                int abc = sc.nextInt();
                if (abc == 1) {
                    add();
                }
            }
        }
        else if (AC_Type == 2) {
            System.out.println("------------------------------");
            System.out.println("You selected Saving Account!");
            System.out.println("------------------------------");
            System.out.println("1) Deposit");
            System.out.println("2) Withdraw");
            System.out.println("3) Balance Enquiry");
            System.out.print("Select Your Process: ");
            long Process = sc.nextInt();
            if (Process == 1) {
                System.out.println("------------------------");
                System.out.println("You Selected Deposit!");
                System.out.println("------------------------");
                System.out.print("Enter Deposit Amount: ");
                long Deposit = sc.nextInt();
                amount=amount+Deposit;
                System.out.println("Amount ₹" + Deposit + " Is Deposited To Your Account Successfully");
                System.out.println("1) Continue");
                System.out.println("2) Exit\n");
                System.out.print("   Enter: ");
                int CNE = sc.nextInt();
                if (CNE == 1) {
                    add();
                }
            } else if (Process == 2) {
                System.out.println("------------------------");
                System.out.println("You Selected Withdraw!");
                System.out.println("------------------------");
                System.out.print("Enter Amount: ");
                long Withdraw = sc.nextInt();
                for (int i = 0; i < 1; i++) {
                    if (Withdraw <= amount) {
                        System.out.println("Amount Withdraw " + Withdraw);
                        amount= amount-Withdraw;
                        System.out.println("Your Balance Amount: "+amount);
                        System.out.println("1) Continue");
                        System.out.println("2) Exit\n");
                        System.out.print("   Enter: ");
                        int abc = sc.nextInt();
                        if (abc == 1) {
                            add();
                        }
                    } else {
                        System.out.println("# Insufficient Amount ⚠️\n");
                        System.out.println("1) Continue");
                        System.out.println("2) Exit\n");
                        System.out.print("   Enter: ");
                        int abc = sc.nextInt();
                        if (abc == 1) {
                            add();
                        }
                    }
                }
            }
            else if (Process == 3){
                System.out.println("---------------------------------");
                System.out.println("You Selected Balance Enquiry!");
                System.out.println("---------------------------------");
                System.out.println("Your Balance Amount Is: "+amount);
                System.out.println("1) Continue");
                System.out.println("2) Exit\n");
                System.out.print("   Enter: ");
                int abc = sc.nextInt();
                if (abc == 1) {
                    add();
                }
            }
        }
    }
}