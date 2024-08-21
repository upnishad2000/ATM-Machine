import Atmfile.*;
import java.util.*;


public class MainSource{

    public static void main(String [] args){
        UserInfo u1=new UserInfo();
        Scanner sc=new Scanner(System.in);
        System.out.println("      :: Welcome to ATM Machine :: \n ");
        System.out.println(" -------LOGIN HEAR FOR BANKING--------- ");
        System.out.print(" Account Number :- \n");
        int acc=sc.nextInt();
        System.out.print(" Account Pin    :- \n");
        int pass=sc.nextInt();

        //check account and password 

        if(u1.getaccount()==acc && u1.getpassword()==pass){
            while(true){
            System.out.println(" 1] View Balance \n 2] Deposite \n 3] Withdraw  \n 4] Mini Statment  \n 5] Exite");
            //user choose the option 
            int UC= sc.nextInt();
            if(UC==1){
                u1.Balance();

            }
            else if(UC==2){
                u1.Deposite();

            }
            else if(UC==3){
                u1.Withdraw();

            }
            else if(UC==4){
                u1.Statment();

            }
            else if(UC==5){
                System.out.println(" THANK YOU FOR BANKING ");
                break;
            }


            }

        }    

      }
}