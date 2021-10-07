package CodeExample;

import java.util.Scanner;

public class InputOutputIfElse {
    //biar berwarna
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String [] args){
        //Input
        System.out.print ("Apakah Anda Member? [YA/TIDAK]\n");
        Scanner input = new Scanner(System.in);
        String member = input.next();
        System.out.print ("Isi Jumlah Belanjaan Anda! \n");
        int Belanja = input.nextInt();

        //Output
        System.out.print ("\nMember - " + member + "\n");
        System.out.print ("Total Belanja - " + Belanja);

        //Condition
        if (member.equalsIgnoreCase("YA")){
            if (Belanja>=500000){
                System.out.print ("\nDiskon Belanja Anda "+ANSI_YELLOW+ "50 Ribu"+ANSI_YELLOW);
            } else if (Belanja>=100000){
                System.out.print ("\nDiskon Belanja Anda "+ANSI_YELLOW+ "15 Ribu"+ANSI_YELLOW);
            } else {
                System.out.print ("\nAnda Tidak Mendapat Diskon "+ANSI_YELLOW+ ":("+ANSI_YELLOW);
            }
        }
        else {
            if (Belanja>=100000){
                System.out.print ("\nDiskon Belanja Anda "+ANSI_YELLOW+ "5 Ribu"+ANSI_YELLOW);
            } else {
                System.out.print ("\nAnda Tidak Mendapat Diskon "+ANSI_YELLOW+ ":("+ANSI_YELLOW);
            }
        }
    }

}
