 import java.util.Scanner;
 
 class pin{
    int bal = 30000000;
    int pin =1010;
    Scanner sc = new Scanner(System.in);
    int value = sc.nextInt();

   public void checkpin(){                    ////checkpin
        
      System.out.println("Enter your pin : ");
      Scanner scr = new Scanner(System.in);
      int enteredpin = scr.nextInt();
      if(enteredpin == pin){
        menu();
      }
      else{
        System.out.println("Enter the valid pin");
      }
    }

    public void Checkbalance(){
        System.out.println("Total balance" + bal );
        menu();
          }

      public void Deposit(){
        System.out.println("enter the amount  u want to deposit : ");
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        bal = bal + amount ; 
        System.out.println("Deposit successfully");
        menu();
      }

      public void Withdrawmoney(){
        System.out.println("enter the amount u wnat to withdraw : ");
        Scanner scan = new Scanner(System.in);
         int amount = scan.nextInt();
         if(amount > bal){
            System.out.println("Insufficient Balance");
         }
         else{
            bal = bal - amount;
            System.out.println("money withdrawl successful");
         }
         System.out.println("total balance : " + bal);
         menu();
              }

         public void Exit(){
          System.out.println("Enter the valid Pin");
          menu();
         }     

    public void menu(){
    System.out.println("Enter your choice:");
    System.out.println(" 1. Check the A/c Balance:");
    System.out.println(" 2. Deposit money:");
    System.out.println(" 3. With drawl money:");
    System.out.println(" 4. Exit ");
    
    Scanner sc = new Scanner(System.in);
    int value = sc.nextInt() ;

    if( value == 1){
      Checkbalance();
    }
    else if(value == 2){
      Deposit();
    }
    else if( value == 3){
        Withdrawmoney();
    }
    else{
        menu();
    }
    }
 }

public class Atmmachineusingoop{
   public static void main(String[] args) {
   
   
   pin obj = new pin();
   obj.checkpin();
   
   
   }
}
