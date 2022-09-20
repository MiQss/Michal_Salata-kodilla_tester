import java.util.Scanner;
public class ColorApplication {
    public static String getColor(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wybierz kolor (C-czerwony, Z-zielony, N-niebieski):");
            String col = scanner.nextLine().trim().toUpperCase();
            switch (col){
                case "C":
                    System.out.println("Czerwony");
                    break;
                case "Z":
                    System.out.println("Zielony");
                    break;
                case "N":
                    System.out.println("Niebieski");
                    break;
            }
            return col;
        }
    }
}
