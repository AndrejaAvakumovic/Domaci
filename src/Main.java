import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int brojac= 0;
        String novaRec = "";

        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter some word ");

        String unos = sc.nextLine();
        System.out.println("Inputed word is "  + unos);


        for (int i = 0; i < unos.length(); i++){
           if(unos.toUpperCase().charAt(i) =='A'){
               brojac++;
           }
            }
        System.out.println("Number of inputed a is :" + brojac);


      for (int i= unos.length()-1; i>=0; i--){
          novaRec+= unos.charAt(i);
      }
       System.out.println("Obrnuto je :"+novaRec);

    }
}
