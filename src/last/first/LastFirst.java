/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package last.first;
import java.util.Scanner;
public class LastFirst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       while(t>0)
       {
          int n=in.nextInt();
          int sum=0,firstdigit,lastdigit;
          lastdigit=n%10;
          firstdigit=n;
          while(n>=10)
          {
           
           n=n/10;
          }
          firstdigit=n;
          sum=firstdigit+lastdigit;
           System.out.println(sum);
       }
       t--;
    }
    
}
