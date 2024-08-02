import java.util.Scanner;  
public class CaesarCipher {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter Plain Text: ");
    String pt = sc.nextLine(); 
    System.out.print("Enter Key for Encryption: ");
    int keyp = sc.nextInt();
    System.out.print("Encrypted text: ");

    char [] plaintext = pt.toLowerCase().toCharArray();
    for (char c : plaintext) {
        int ascii=(int)c;
            if(ascii>(122-keyp)){

                ascii=ascii-26;
            }
            ascii=ascii+keyp;
            System.out.print((char)ascii);
        }
    System.out.println();
    System.out.println();
    
    Scanner sc1 = new Scanner(System.in);  
    System.out.print("Enter Chypher Text: ");
    String ct = sc1.nextLine();
    System.out.print("Enter Key for Decryption: ");
    int keyc = sc.nextInt();
    System.out.print("Decrypted text: ");
    char [] chyphertext = ct.toLowerCase().toCharArray();
    for (char c : chyphertext) {
        int ascii=(int)c;
            if(ascii<(97+keyc)){

                ascii=ascii+26;
            }
            ascii=ascii-keyc;
            System.out.print((char)ascii);
        }
  }
}
