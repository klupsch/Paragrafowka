package com.company.Menu;

import com.company.Akcje.Wybor;
import com.company.Klasy.Knight;
import com.company.Klasy.Mag;

import java.util.Scanner;

public class MenuGlowne {

    public void menuGlowne()
    {



    while (true) {


        Scanner wybor = new Scanner(System.in);
        System.out.println("====================================" +
                "\nLoch złego programisty java" +
                "\n====================================");
        System.out.println("Wybierz klase  " +
                "\n1: Mag  " +
                "\n2: Knight");
        System.out.print("\n=================================="+
                "\nTwój wybór to: " + " \n "
        );

        int wyborKlasy = wybor.nextInt();

        if (wyborKlasy == 1) {

            Mag mag = new Mag();
            mag.mag();
            Wybor wyborKlasyUzytkownika = new Wybor();
            wyborKlasyUzytkownika.definitywnyWybor();

            break;
        }
        if (wyborKlasy == 2) {

            Knight knight=new Knight();
            knight.knight();
            Wybor wyborKlasyUzytkownika = new Wybor();
            wyborKlasyUzytkownika.definitywnyWybor();
            break;

        }
        else if (wyborKlasy != 1 || wyborKlasy !=2) ;

        {
            System.out.println("wybierz 1 lub 2");

        }

    }
}


}
