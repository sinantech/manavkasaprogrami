import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args){

        float armut,elma,domates,muz,patlican ;
        float a= (float) 2.14;
        float e= (float) 3.67;
        float d= (float) 1.11;
        float m= (float) 0.95;
        float p= (float) 5.00;

        Scanner inp = new Scanner (System.in) ;
        System.out.print("Armut kilo degerini giriniz" + ":" + " ");
        armut = inp.nextFloat();
        System.out.print("Elma kilo degerini giriniz" + ":" + " ");
        elma = inp.nextFloat();
        System.out.print("Domatis kilo degerini giriniz" + ":" + " ");
        domates = inp.nextFloat();
        System.out.print("Muz kilo degerini giriniz" + ":" + " ");
        muz = inp.nextFloat();
        System.out.print("Patlican kilo degerini giriniz" + ":" + " ");
        patlican = inp.nextFloat();
        float Toplam =((armut*a) + (elma*e) + (domates*d) + (muz*m) + (patlican*p)) ;
        System.out.println("Toplam = " + " " + Toplam);












    }
}
