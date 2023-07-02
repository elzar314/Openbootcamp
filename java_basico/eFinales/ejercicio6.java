package eFinales;

import java.util.ArrayList;

public class ejercicio6 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i=1;i<=10;i++){
            numeros.add(i);
        }

        System.out.println(numeros);

        int i = 0;
        while(i<numeros.size()){
            if(numeros.get(i)%2==0){
                numeros.remove(i);
            }else if(numeros.get(i)%2!=0){
                i++;
            }
        }

        System.out.println(numeros);


    }
}
