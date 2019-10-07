import java.util.Scanner;
class Question6{
    public static void main(){
        Scanner scan=new Scanner(System.in);
        int height=scan.nextInt();
        int width=scan.nextInt();
        displayBox(height,width);
    }
    public static void displayBox(int h, int w){
        for(int i1=0;i1<h;i1++){
            for(int i2=0;i2<w;i2++){
                System.out.print("$");
            }
            System.out.println("");
        }
    }
}