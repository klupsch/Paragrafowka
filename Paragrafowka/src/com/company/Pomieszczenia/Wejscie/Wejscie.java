package com.company.Pomieszczenia.Wejscie;

import com.company.Akcje.Smierc;

import java.util.Scanner;

public class Wejscie {


    public void wejscie() {

        Scanner wybor = new Scanner(System.in);
        System.out.println("Stoisz przed wejsciem do lochu.Co robisz?" +
                "\n[1] Wchodzę." +
                "\n[2] Uciekam na pustkowia aby zyć wśród dzikich patisonów" +
                "\n[3] Przeszukuję okolice wejścia.");


        int kierunekRuchu = wybor.nextInt();

        if (kierunekRuchu == 1) {

            Smierc smierc = new Smierc();
            smierc.smierc();


        }
        if (kierunekRuchu == 2) {

            //   MenuGlowne menuGlowne=new MenuGlowne();
            //   menuGlowne.menuGlowne();


        }

        if (kierunekRuchu == 3)

        {

        } else if (kierunekRuchu != 1 || kierunekRuchu != 2 || kierunekRuchu != 3) ;

        {
            System.out.println("wybierz kierunek ruchu");
            wejscie();

        }
    }

}

