/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package important;

import java.util.Scanner;

/**
 *
 * @author MOKLET GAMING
 */
public class Important {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Salma Cahyaningtyas
        *36 / X RPL 6
        */
        
        Scanner input=new Scanner(System.in);
        int HargaBunga=0, HargaBungaa=0, total, uang, kembalian;
        String again;
        
        System.out.println("Welcome to La La Violeta Shop");
        System.out.println("Please tell us what you want to order.. We offer fresh flowers.");
        System.out.println("=====================================");
        System.out.println("Our flower list..");
        System.out.println("Daisy");
        System.out.println("Lily");
        System.out.println("Rose");
        System.out.println("Rosella");
        System.out.println("Baby Breath");
        System.out.println("=====================================");
        System.out.print("Enter your order: ");
        String order=input.nextLine();
        System.out.println("Ohhh.. You have good taste");
        
        switch (order){
            case "Daisy":HargaBunga=27000;break;
            case "Lily":HargaBunga=40000;break;
            case "Rose":HargaBunga=50000;break;
            case "Rosella":HargaBunga=70000;break;
            case "Baby Breath":HargaBunga= 41000;break;
        }
        System.out.println("Would you like to purchase one more flower? Again / No");
        again=input.nextLine();
        if(again.equalsIgnoreCase("Again")){
            System.out.println("Then what do you wanna order again sweety?");
        }else if(again.equalsIgnoreCase("No")){
            System.out.println("Thanks for coming.. don't forget to come back!!");System.exit(0);
        }else{
            System.out.println("End");
        }
        /*-------------------------New Order-------------------------*/
        
        System.out.println("Daisy");
        System.out.println("Lily");
        System.out.println("Rose");
        System.out.println("Rosella");
        System.out.println("Baby Breath");
        System.out.println("=====================================");
        System.out.print("Enter your order again: ");
        String orderr=input.nextLine();
        
        switch (order){
            case "Daisy":HargaBungaa=27000;break;
            case "Lily":HargaBungaa=40000;break;
            case "Rose":HargaBungaa=50000;break;
            case "Rosella":HargaBungaa=70000;break;
            case "Baby Breath":HargaBungaa= 41000;break;
        }
        
        total=HargaBunga+HargaBungaa;
        System.out.print("Enter the amount of money you have: ");
        uang=input.nextInt();
      
        if(uang>HargaBunga){
            kembalian=uang-HargaBunga;
            System.out.println("Money still available: "+kembalian);
        }else{
            System.out.println("I'm sorry, you don't have enough money..");
        }
    }
    
}
