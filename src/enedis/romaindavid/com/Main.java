package enedis.romaindavid.com;

import enedis.romaindavid.com.level1.SomeFunction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Excercice 1
        System.out.println("Excercie 1 : factoriel de 4");
        System.out.println(SomeFunction.factorial( 4 ));


        //Excercice 2
        int[] myArrayInt = new int[5000];
        int n = 0;
        for(int i = 0; i < 10 ; i++ ){
            for(int j = 0 ; j < 1000; j = j + 3){
                myArrayInt[ n++ ]= j ;
            }
        }
        System.out.println("\n");

        // Valeur existante sorti index de la première occurence
        System.out.println("Excercie 2 :  première ocuurence de 9");
        System.out.println(SomeFunction.firstIntInArray( myArrayInt, 9));
        // Valeur inexistante
        System.out.println("Excercie 2 :  première ocuurence de 4");
        System.out.println(SomeFunction.firstIntInArray( myArrayInt, 4));


        // Excercice 3
        System.out.println("\n");
        System.out.println("Excercice 3: inversion d'une chaîne de caractère");
        System.out.println(SomeFunction.inverseString("java interview"));

        // Excercice 4
        System.out.println("\n");
        System.out.println("Excercie 4 : Trouver la plus grande valeur d'un tableau");
        int[] tabInt = new int[4];
        tabInt[0] = 1 ;
        tabInt[1] = 31;
        tabInt[2] = 74 ;
        tabInt[3] = 47;
        System.out.println(SomeFunction.theBiggerInt( tabInt ) );

        // Excercice 5
        System.out.println("\n");
        System.out.println("Excercie 5 : Multiple de 3 ou de 5");
        System.out.println(SomeFunction.isModulo3ou5( 5 ));

        // Excercice 6
        System.out.println("\n");
        System.out.println("Excercice 6 : isPalindrome ");
        System.out.println("test du Mot ABBA " + SomeFunction.isPalindrome("ABBA"));
        System.out.println("test du Mot Papa " + SomeFunction.isPalindrome("Papa"));

        // Excercice 7
        String maPhrase ="Je regarde dans cette phrase qu'elle est le mot le plus long";
        SomeFunction.leMotLePlusLong( maPhrase );


    }

}
