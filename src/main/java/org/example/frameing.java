package org.example;

import java.sql.SQLException;
import java.util.Scanner;

public class frameing {

    public void bankinfo() throws SQLException {
        Scanner scan = new Scanner(System.in);
boolean t=true;
        while (t) {
            System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(" ***Banking System Application***");
            System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(" 1. Create a new account");
            System.out.println(" 2. Check Balance");
            System.out.println(" 3. Deposit the amount");
            System.out.println(" 4. Withdraw the amount");
            System.out.println(" 5. Watch demo account");
            System.out.println(" 6. Exit");
            System.out.print("\n ENTER YOUR CHOICE :: ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    proces process = new proces();
                    process.newaccount();
                    break;
                case 2:
                    System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    proces poce=new proces();
                    poce.checkbal();
                    System.out.println("MAIN PAGE_:: PRESS 1 ::");


                    break;
                case 3:
                    System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println("---------WELCOME TO DEPOSITE PAGE---------------- ");
                proces proces=new proces();
                    proces.deposit();
                System.out.println();
                System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("MAIN PAGE_:: PRESS 1 ::");

                break;

                case 6:

                    System.out.println("\n Thank you for using our Banking System!");
                    t=false;
                    return;
                default:
                    System.out.println("\n Invalid choice! Please enter a valid option.");
            }
        }
    }
}


//            case 3:
////                System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
////                System.out.println();
////                System.out.println("---------WELCOME TO DEPOSITE PAGE---------------- ");
////                bankprocess.deposite();
////                System.out.println();
////                System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
////                System.out.println("MAIN PAGE_:: PRESS 1 ::");
////                if (scan.nextInt()==1)
////                    bankinfo();
////                break;
////            case 4:
////                System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
////                bankprocess.withdraw();
////                System.out.println();
////                System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
////                System.out.println("MAIN PAGE_:: PRESS 1 ::");
////                if (scan.nextInt()==1)
////                    bankinfo();
////                break;
////            case 5:
////                System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
////                bankprocess.demoaccount();
////                System.out.println();
////                System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
////                System.out.println("MAIN PAGE_:: PRESS 1 ::");
////                if (scan.nextInt()==1)
////                    bankinfo();
////                break;
////            case 6:
////                System.out.println("THANKS FOR USING OUT BANK APPLICATION");
////                break;
//        }
//    }
//}
//        }}}