package College;

import java.util.Spliterator;

final class MyEncryption{
    private final int key;

    public MyEncryption(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

//    public void setKey(int key) {
//        this.key = key;
//    }

    String ceaserCipher(String plainText, int key){
        String cipherText = plainText;
        for(int i = 0; i < plainText.length(); i++){
            char newchar;
            if(cipherText.charAt(i) == ' ') continue;
            if(cipherText.charAt(i) + key > 122)
                newchar = (char)(cipherText.charAt(i) + key - 26);
            else
                newchar = (char)(cipherText.charAt(i) + key);

            cipherText = cipherText.substring(0, i) + newchar + cipherText.substring(i+1, cipherText.length());
        }
        return cipherText;
    }

    String ceaserCipher(String plainText){
        String cipherText = plainText;
        for(int i = 0; i < plainText.length(); i++){
            char newchar;
            if(cipherText.charAt(i) == ' ') continue;
            if(cipherText.charAt(i) + key > 122)
                newchar = (char)(cipherText.charAt(i) + getKey() - 26);
            else
                newchar = (char)(cipherText.charAt(i) + getKey());

            cipherText = cipherText.substring(0, i) + newchar + cipherText.substring(i+1, cipherText.length());
        }
        return cipherText;
    }

    String transpositionCipher(String plainText){
        StringBuilder cipherText = new StringBuilder();
        String temp = plainText.replaceAll(" ", "");
        int row = temp.length() % 5 == 0 ? (temp.length()/5) : (temp.length()/5 + 1);
        int col = 5;

        char[][] modified = new char[row][col];
        int k = 0;
        for(int i = 0; i < row && k < temp.length(); i++){
            for(int j = 0; j < col && k < temp.length(); j++){
                modified[i][j] = temp.charAt(k++);
            }
        }
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                if(modified[j][i] != '\0') cipherText.append(modified[j][i]);
            }
        }
        return cipherText.toString();
    }

    String findEncryption(String plainText, String cipherText){
        if(ceaserCipher(plainText).equals(cipherText))
            return "Ceaser cipher";
        else if(transpositionCipher(plainText).equals(cipherText))
            return "transposition cipher";
        else return "Invalid encryption";
    }
}

public class MyEncryptionMain{
    public static void main(String[] args) {
        MyEncryption myEncryption = new MyEncryption(1);
        System.out.println(myEncryption.ceaserCipher("attack at dawn", 4));
        System.out.println(myEncryption.transpositionCipher("golden statue is in eleventh cave"));
        System.out.println(myEncryption.findEncryption("ABC", "BCD"));
    }
}
