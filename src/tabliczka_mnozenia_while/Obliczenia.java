package tabliczka_mnozenia_while;

public class Obliczenia {

    public static void main(String[] args)
    {
        int n=10, wiersze, kolumny;

        System.out.println("Program wyswietla tabliczke mnozenia.");

        wiersze = 1; //wartosc poczatkowa

        while(wiersze <= n)
        {
            kolumny = 1; //wartosc poczatkowa

            while(kolumny <= n)
            {
                System.out.print(wiersze * kolumny + "\t");
                kolumny++;
            }
            wiersze++;
            System.out.println();
        }
    }
}
