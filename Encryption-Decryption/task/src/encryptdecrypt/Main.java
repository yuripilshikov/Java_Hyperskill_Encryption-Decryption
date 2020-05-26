package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //String command = scanner.nextLine();
        //String str = scanner.nextLine();
        //int key = scanner.nextInt();

        






        /*if(command.equals("enc")) {
            encrypt(str, key);
        } else if(command.equals("dec")) {
            decrypt(str, key);
        }*/




    }

    public static void encrypt(String str, int key) {
        char[] chars = str.toCharArray();

        for(int i = 0; i< chars.length; i++) {
            chars[i] += key;
        }
        System.out.println(chars);
    }

    public static void decrypt(String str, int key) {
        char[] chars = str.toCharArray();

        for(int i = 0; i< chars.length; i++) {
            chars[i] -= key;
        }
        System.out.println(chars);
    }
}
