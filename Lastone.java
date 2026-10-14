/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastone;

import java.util.Scanner;

/**
 *
 * @author ornella
 */
public class Lastone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sh,eh;
       Scanner input=new Scanner(System.in);
       System.out.println("enter the starting hour");
       sh=input.nextInt();
                System.out.println("enter the ending hour");
       eh=input.nextInt();
       int h,total;
       h=eh-sh;
       if(sh<0||sh>23||eh<1||eh>24){
           System.out.println("stop there");
       }
       else if((sh>eh)){
          
           System.out.println("can't work");
       }
       else if(sh>=0&&eh<=7||sh>=21&&eh<=24){
           total=500*h;
           System.out.println("the rent will be 500 RWF per hour"+"and your total:"+total);
       }
       else if(sh>=7&&eh<=14||sh>=19&&eh<=21){
           total=1000*h;
           System.out.println("the rent will be 1000 RWF per hour"+"and your total:"+total);
       }
       else if(sh>=14&&eh<=19){
           total=1500*h;
           System.out.println("the rent will be 1500 RWF per hour"+"and your total:"+total);
       }else{
           System.out.println("not working");
       }
       
    }
    
}
 