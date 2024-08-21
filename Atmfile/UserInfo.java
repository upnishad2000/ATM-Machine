package Atmfile;
import java.util.*;

 public class UserInfo{
    //User data 
    private int account=1;
    private int password=2;
    public  int  at ;
    private double balance=0;
    private String wbalance;
    private String dbalance;
    public double wit;
    public double dep;
    public int i=0;
    public int count=0;
    public int j=0;
    public int wcount=0;
    
    public  double[] arr=new double[50];
    public  double[] warr=new double[50];
    

    public int getaccount(){
        return account;
    }
    public int getpassword(){
        return password;
    }
    public double setbalance(){
        return balance;
    }

    // view balance methode
    public void  Balance(){
        System.out.println("Available Balance :- "+ this.setbalance());

    }
    //deposite method 
    public void Deposite(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Deposite Amount");
        this.dep=sc.nextDouble();
        if(this.dep>=100){
        this.balance=this.balance+this.dep;
        System.out.println("Current Balance :- "+this.balance + "\n Thansk you for deposite "+dep+"$");
        arr[i]=this.dep;
        i++;
        count++;
           
    }
        else{
           System.out.println("Enter a Amount Greter then 100 ");
        }
    }
    // Deposite method end 

    //Withdraw method 
    public void Withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Withdraw Amount ");
         this.wit=sc.nextDouble();
        if(this.balance>this.wit){
            System.out.println( this.wit +" Withdra sussefull ");
            this.balance=this.balance-this.wit;
            System.out.println("Current Balance is "+this.balance);
            warr[j]=this.wit;
            j++;
            wcount++;


        }else {
            System.out.print("Insuffitiont balance ");


    }
}
// mini Statment 
public void Statment(){
    Scanner sc =new Scanner (System.in);
    while(true){
 System.out.println(" 1] Deposite Statment \n 2] Withdraw Statment \n 3] Back ");
 int userchoose=sc.nextInt();
 if(userchoose==1){
    for( int k=0;k<=count;k++){
        System.out.println(" deposite amount "+arr[k]);
       }
 
    }
    else if(userchoose==2){
        for(int k=0;k<wcount;k++){
            System.out.println("Withdraw amount = "+warr[k]);
        }

    }else if(userchoose==3){
        break;

    }
    else{
        System.out.println("Wrong input");
    }
    }

}

 
 
}

