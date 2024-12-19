package com.mouredev.weeklychallemge2022;


public class  Main {
    public static void main(String[] args) {
        for ( int index = 1;  index <=100;  index++ ) {
            var divisiblebyFour = index % 4 == 0;
            var divisiblebySix = index % 6 == 0;

            /// numero divisible tanto por 4 como por 6
            if (divisiblebyFour && divisiblebySix) {
               System.out.println("Te amo mi hermanito");
            }//si es divisible por 4
            else if (divisiblebyFour) {
                System.out.println("genial");
            } //si es divisible por 6

            else if (divisiblebySix) {
                System.out.println("eres un hermano valiente");
            }
            //si no esdivisible
            else {
                System.out.println("valiente");
            }
        }
    }
}