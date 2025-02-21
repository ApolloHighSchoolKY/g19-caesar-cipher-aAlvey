/**
 * @(#)CaesarCipher.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */


public class CaesarCipher {

	private char[] alphabet;
	private char[] shifted;
	private int shift;

    public CaesarCipher() {

        char [] alphabet = new char[26];

        alphabet [0] = 'A';
        alphabet [1] = 'B';
        alphabet [2] = 'C';
        alphabet [3] = 'D';
        alphabet [4] = 'E';
        alphabet [5] = 'F';
        alphabet [6] = 'G';
        alphabet [7] = 'H';
        alphabet [8] = 'I';
        alphabet [9] = 'J';
        alphabet [10] = 'K';
        alphabet [11] = 'L';
        alphabet [12] = 'M';
        alphabet [13] = 'N';
        alphabet [14] = 'O';
        alphabet [15] = 'P';
        alphabet [16] = 'Q';
        alphabet [17] = 'R';
        alphabet [18] = 'S';
        alphabet [19] = 'T';
        alphabet [20] = 'U';
        alphabet [21] = 'V';
        alphabet [22] = 'W';
        alphabet [23] = 'X';
        alphabet [24] = 'Y';
        alphabet [25] = 'Z';

    }

    public CaesarCipher(int num){

        char [] alphabet = new char[26];
        char [] shifted = new char[26];

        for (int i = 0; i< alphabet.length; i++){
           if(shifted[i] + num % 26 == shifted[i])
            shifted[i] = alphabet[i+num];
            else{
                shifted[i] = alphabet[shifted[i] + num % 26];
            }
        }
    }

    public String encrypt(String message){

        String encrypted = "";
        boolean orig = false;
        int sum = 0;

        for (int i = 0; i < message.length(); i++){
            for (int j = 0; j< alphabet.length; j++){
                if(alphabet[j] == message.charAt(i)){
                                                                     //message.replace(message.charAt(i),shifted[j]);
                    char enchar = shifted[j];
                    encrypted += enchar;
                }
                if (message.charAt(i) != alphabet[j]){
                    for (int x = 0; x < alphabet.length; x++){
                    sum ++;
                    if (sum >= 26){
                        orig = true;
                        if(orig == true){
                            char y = message.charAt(i);
                            encrypted += y;
                            sum  = 0;
                        }
                    }
                }
                }
                
            }
           
        }
        return "" + encrypted;

    }

    public String decrypt(String message){

        String decrypted = "";
        boolean orig = false;
        int sum = 0;

        for (int i = 0; i < message.length(); i++){
            for (int j = 0; j< shifted.length; j++){
                if(shifted[j] == message.charAt(i)){
                                                                     //message.replace(message.charAt(i),shifted[j]);
                    char enchar = alphabet[j];
                    decrypted += enchar;
                }
                if (message.charAt(i) != shifted[j]){
                    for (int x = 0; x < shifted.length; x++){
                    sum ++;
                    if (sum >= 26){
                        orig = true;
                        if(orig == true){
                            char y = message.charAt(i);
                            decrypted += y;
                            sum  = 0;
                        }
                    }
                }
                }
                
            }
           
        }
        return "" + decrypted;

    }

    public void shifter(int num){

        // take value and shift them over NUM spaces
        // call this
        // populate the shifted array

        char [] shiftedText = new char[alphabet.length];

        for (int i = 0; i< alphabet.length; i++){
         

            shiftedText[i] = alphabet[i + num % 26];

            //char currentchar = shiftedText[i];
        }


    }


}