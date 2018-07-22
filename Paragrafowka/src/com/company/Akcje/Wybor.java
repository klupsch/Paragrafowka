package com.company.Akcje;

import com.company.Menu.MenuGlowne;
import com.company.Pomieszczenia.Wejscie.Wejscie;

import java.util.Scanner;
public class Wybor {




        public void definitywnyWybor ()

        {

        Scanner wybor = new Scanner(System.in);
        System.out.println("Czy jestes pewny swego wyboru? Tak[1]/Nie[2]");

        int pewnyWyboru = wybor.nextInt();

        if (pewnyWyboru == 1) {

            Wejscie wejscie = new Wejscie();
            wejscie.wejscie();


        }
        if (pewnyWyboru == 2) {

            MenuGlowne menuGlowne=new MenuGlowne();
            menuGlowne.menuGlowne();



        } else if (pewnyWyboru != 1 || pewnyWyboru != 2) ;

        {
            System.out.println("wybierz 1 lub 2");

        }

    }


    }



