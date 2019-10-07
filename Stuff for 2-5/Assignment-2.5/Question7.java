import java.util.Scanner;
class Question7{
    public static void main(){
         Scanner scan=new Scanner(System.in);
         int total;
         int amount;
         int sides;
         boolean again=true;
         String again1;
         while(again){
             System.out.println("How many D6's do you want to roll?");
             amount=scan.nextInt();
             System.out.println("How many sides do these dice have?");
             sides=scan.nextInt();
             rollDie(amount,sides);
             System.out.println("Again? [y,n]");
             again1=scan.next();
             if(again1.contains("y")) again=true;
             else {
                 again=false;
                 System.out.println("Goodbye");
                }
        }
    }
    public static void rollDie(int amount1, int sides1){
        int total=0;
            for(int i=0;i<amount1;i++){
                 int d=(int)((Math.random()*sides1));
                 d=d+1;
                 total=total+d;
                 System.out.print(d+" ");
             }
        System.out.println("");
        System.out.println("Total:"+total);
    }
}