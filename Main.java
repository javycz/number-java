import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavesnice = new Scanner(System.in);
        Random nahoda = new Random();
        boolean novaHra = true;

        while (novaHra) {
            // V Batchi: set /a cislo=(%random% %% 150)+ 1
            int cislo = nahoda.nextInt(150) + 1;
            int pokusy = 0;

            System.out.println("================================");
            System.out.println("HADANI CISLA 1-150");
            System.out.println("================================");
            System.out.println("\nUhodni cislo mezi 1 a 150!\n");

            while (true) {
                // V Batchi: set /p "tip=Zadej cislo: "
                System.out.print("Zadej cislo: ");
                int tip = klavesnice.nextInt();
                pokusy++; // V Batchi: set /a pokusy+= 1

                // V Batchi: if %tip% LSS %cislo%
                if (tip < cislo) {
                    System.out.println("VICE!\n");
                }
                // V Batchi: if %tip% GTR %cislo%
                else if (tip > cislo) {
                    System.out.println("MENE!\n");
                }
                // Správný tip!
                else {
                    System.out.println("\n================================");
                    System.out.println("SPRAVNE!");
                    System.out.println("================================");
                    System.out.println("Cislo bylo: " + cislo);
                    System.out.println("Pocet pokusu: " + pokusy + "\n");
                    break; // Ukonci hadani a skoci na otazku o nové hre
                }
            }

            // V Batchi: choice /c AN /n /m "Nova hra? [A/N]"
            System.out.print("Nova hra? [A/N]: ");
            String odpoved = klavesnice.next();

            if (odpoved.equalsIgnoreCase("N")) {
                novaHra = false;
                System.out.println("Diky za hru! Ahoj.");
            }
        }

        klavesnice.close();
    }
}

