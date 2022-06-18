package questao3;

import java.util.Scanner;

public class EmoticonsTeste {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Emoticons emoticons = new Emoticons();

        System.out.println("Digite uma mensagem: \n");
        String msg = read.nextLine();
        int upset =0;
        int funny =0;



        for(int i=0; i<msg.length(); i++){
            if (msg.substring(i).startsWith(emoticons.getUpset())) {
                upset ++;
            } if (msg.substring(i).startsWith(emoticons.getFunny())) {
                funny ++;
            }
        }
        if(upset == funny){
            System.out.println("Neutro");
        }if(upset>funny){
            System.out.println("Chateado");
        }else if(funny>upset){
            System.out.println("Divertido");
        }
    }
}
