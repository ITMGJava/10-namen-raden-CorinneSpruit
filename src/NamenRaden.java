import com.sun.jdi.StringReference;

import javax.management.StringValueExp;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class NamenRaden {

    private static Object Array;
    private static Object String;

    public static void main(String[] arg) {

        System.out.println("Laten we een spelletje doen! We gaan je kennis testen over Nederland");
        System.out.println("Welke stad denk jij dat er in de 'Top 10 Grootste Steden van Nederland' staat?");


        String[] steden = new String[10];
        steden[0] = "Amsterdam";
        steden[1] = "Rotterdam";
        steden[2] = "Den Haag";
        steden[3] = "Utrecht";
        steden[4] = "Eindhoven";
        steden[5] = "Groningen";
        steden[6] = "Tilburg";
        steden[7] = "Almere";
        steden[8] = "Breda";
        steden[9] = "Nijmegen";

        for (; ; ) {
            var x = new Scanner(System.in);
            var stad = x.nextLine();
            // boolean invoer = true;
            //    for(var i=0;i<steden.length;i++)


            if (stad.equals(steden[0])) {
                //  invoer = true;
                System.out.println("Dat is correct! " + stad + " staat op nummer 1 en is de grootste stad van Nederland, kun je er nog een noemen?");
            } else if (stad.equals(steden[1])) {
                //  invoer = true;
                System.out.println("Dat is correct! " + stad + " staat op nummer 2 van de grootste steden van Nederland, kun je er nog een noemen?");
            } else if (stad.equals(steden[2])) {
                //   invoer = true;
                System.out.println("Dat is correct! " + stad + " is de nr 3 van de grootste steden van Nederland, kun je er nog een noemen?");
            } else if (stad.equals(steden[3])) {
                //    invoer = true;
                System.out.println("Dat is correct! " + stad + " is de nr 4 van de grootste steden van Nederland, kun je er nog een noemen?");
            } else if (stad.equals(steden[4])) {
                //    invoer = true;
                System.out.println("Dat is correct! " + stad + " is de nr 5 van de grootste steden van Nederland, kun je er nog een noemen?");
            } else if (stad.equals(steden[5])) {
                //  invoer = true;
                System.out.println("Dat is correct! " + stad + " is de nr 6 van de grootste steden van Nederland, kun je er nog een noemen?");
            } else if (stad.equals(steden[6])) {
                //   invoer = true;
                System.out.println("Dat is correct! " + stad + " is de nr 7 van de grootste steden van Nederland, kun je er nog een noemen?");
            } else if (stad.equals(steden[7])) {
                //   invoer = true;
                System.out.println("Dat is correct! " + stad + " is de nr 8 van de grootste steden van Nederland, kun je er nog een noemen?");
            } else if (stad.equals(steden[8])) {
                //   invoer = true;
                System.out.println("Dat is correct! " + stad + " is de nr 9 van de grootste steden van Nederland, kun je er nog een noemen?");
            } else if (stad.equals(steden[9])) {
                //    invoer = true;
                System.out.println("Dat is correct! " + stad + " is de nr 10 van de grootste steden van Nederland, kun je er nog een noemen?");
            } else {
                System.out.println("Helaas, " + stad + " staat niet in de top 10. Probeer het nog eens!");
            }


        }
    }
}










