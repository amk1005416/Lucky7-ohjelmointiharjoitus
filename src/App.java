import java.util.Random;        // Lucky7-ohjelmointiharjoitus
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int oikeanumero = 7;

        String input = "";

        int rahat;

        System.out.print("Syötä rahaa: ");
        input = in.nextLine();
        rahat = Integer.parseInt(input);
        System.out.println();

        
        
        while (rahat > 0) {

                System.out.println("Rahaa " + rahat);

                String input2 = "";

                int randomNumber1;
                randomNumber1 = random.nextInt(11);
                int randomNumber2;
                randomNumber2 = random.nextInt(11);
                int randomNumber3;
                randomNumber3 = random.nextInt(11);

                System.out.println("Random number1 between 0-10: " + randomNumber1);
                System.out.println("Random number2 between 0-10: " + randomNumber2);
                System.out.println("Random number3 between 0-10: " + randomNumber3);
                
                if (randomNumber1 == oikeanumero || randomNumber2 == oikeanumero || randomNumber3 == oikeanumero) {
                    rahat += 1;
                    }
                if (randomNumber1 == oikeanumero && randomNumber2 == oikeanumero) {
                    rahat += 5;
                }
                if (randomNumber2 == oikeanumero &&  randomNumber3 ==oikeanumero) {
                    rahat += 5;
                }
                if (randomNumber3 == oikeanumero && randomNumber1 == oikeanumero) {
                    rahat += 5; 
                }
       
                rahat--;

                System.out.println("Rahaa jäljellä " + rahat);
                System.out.println();

                if (rahat == 0) {
                    System.out.println("Haluatko pelata uudestaan? Vastaa: Y/N ");
                    input2 = in.nextLine();
                }
                if (input2.equals("Y")) {
                    rahat =+ 10;
                }
                if (input2.equals("N")) {
                    break;                   
                }
                else System.out.println("Et vastannut Y tai N");                                             
            }


    }
}

