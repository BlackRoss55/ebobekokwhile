import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int a,b,i=1,k=1,x,y=1,z=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("a sayısını giriniz: ");
        a = sc.nextInt();
        System.out.print("b sayısını giriniz: ");
        b = sc.nextInt();
        while(i!=a){
            if(a%i==0 && b%i == 0){
                y = i;
            }
            i++;
        }
        System.out.println("a ve b nin EBOB değeri: "+y);
        while(k!=(a*b)){
            if(k%a == 0 && k%b == 0){
                System.out.print("a ve b nin EKOK değeri: "+k);
                break;
            }
            k++;
        }


    }
}