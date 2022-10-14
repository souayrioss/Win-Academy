import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int rows ;
        String guir ;
        Scanner mySmb = new Scanner(System.in);
        System.out.println("Enter symbole ");
        String syb = mySmb.nextLine();
        do {
            Scanner myRws = new Scanner(System.in);
            System.out.println("Enter number rows entre 8 et 35");
            rows = myRws.nextInt();
        }while (rows < 8 || rows > 35);
        do {
            Scanner MyGuir = new Scanner(System.in);
            System.out.println("Enter guirlandes voulez-vous mettre entre 3 et 25");
            guir = MyGuir.nextLine();
        }while (guir.length() < 3 || guir.length() > 25);


        StringBuffer symboles  = new StringBuffer();
        StringBuffer symboles1  = new StringBuffer();
        Random random = new Random();

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < 2 * i + 1; j++) {
                int nr = 2+random.nextInt(2);
                symboles.append(syb.repeat(nr)+guir);
                if(symboles.length() >= Math.pow(rows, 2)){
                    break;
                }
            }
            if(symboles.length() >= Math.pow(rows, 2)){
                break;
            }
        }
        System.out.println(symboles);
        System.out.println("\n\n");
        int x=0;
        for (int i = 1; i <= rows; i++) {

            // loop to print the number of spaces before the star
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }

            // loop to print the number of stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(symboles.charAt(x) + " ");
                x++;
            }

            // for new line after printing each row
            System.out.println();

        }
        afficherTronc(rows);
        //int finalRows = rows;
        //symboles.forEach((n) -> System.out.println(String.join("", Collections.nCopies(finalRows-symboles.indexOf(n)-1, " ")) + n));

    }
    static void afficherTronc(int nbLigne) {
        int largeur;
        int hauteur;

        largeur = (nbLigne*2 - 1) / 5;
        if (largeur % 2 == 0)
            ++largeur;
        hauteur = Math.max(1, nbLigne/3);
        for (int i = 0; i < hauteur; ++i) {
            for (int j = 0; j < nbLigne /1.2; ++j)
                System.out.print(" ");
            for (int j = 0; j < largeur; ++j)
                System.out.print("|");
            System.out.println();
        }
    }


}

/* for (int i = 0; i < rows; i++) {

        System.out.println(String.join(" ", Collections.nCopies(rows-i-1, " ")) + String.join(" ", Collections.nCopies(2 * i + 1, syb)));

}
///////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////
int rows ;
        do {
            Scanner myRws = new Scanner(System.in);
            System.out.println("Enter number rows entre 8 et 35");
            rows = myRws.nextInt();
        }while (rows < 8 || rows > 35);
        Scanner mySmb = new Scanner(System.in);
        System.out.println("Enter symbole ");
        String syb = mySmb.nextLine();

        ArrayList<String> symboles = new ArrayList<>();
        for (int i = 0; i < rows; i++){
            symboles.add(syb.repeat(2*i+1));
        }
        int finalRows = rows;
        symboles.forEach((n) -> System.out.println(String.join("", Collections.nCopies(finalRows-symboles.indexOf(n)-1, " ")) + n));

        ///////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////


      static void afficherTronc(int nbLigne) {
        int largeur;
        int hauteur;

        largeur = (nbLigne*2 - 1) / 5;
        if (largeur % 2 == 0)
            ++largeur;
        hauteur = Math.max(1, nbLigne/3);
        for (int i = 0; i < hauteur; ++i) {
            for (int j = 0; j < ((nbLigne*2 -1) - 3); ++j)
                System.out.print(" ");
            for (int j = 0; j < largeur; ++j)
                System.out.print("|");
            System.out.println();
        }
    }

    ///////////////////////////////////////////
///////////////////////////////////////////
/*for (int i = 0; i < rows; i++){
        for (int j = 0; j < 2 * i + 1; j++) {
        symboles.append(syb);
        }
        }
        int max = symboles.length()-guir.length();
        int min = 1;
        int range = max - min + 1;

        for (int i = 0; i < symboles.length()/guir.length(); i++){
        int a =(int)(Math.random() * range) + min;
        symboles.replace(a, a+guir.length(), guir);
        }
        System.out.print(symboles);

 */