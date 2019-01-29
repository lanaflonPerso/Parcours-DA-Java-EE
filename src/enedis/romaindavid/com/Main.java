package enedis.romaindavid.com;

import enedis.romaindavid.com.Level_1.SomeFunction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Excercice 1
        System.out.println("Excercie 1 : factoriel de 4");
        System.out.println(SomeFunction.factorial( 4 ));
        System.out.println("\n");
        System.out.println("Excercie 2 :  de 4");

        //Excercice 2
        List<Integer> myArrayInt = new ArrayList<Integer>();
        for(int i = 0; i < 10 ; i++ ){
            for(int j = 0 ; j < 1000; j = j + 3){
                myArrayInt.add( j );
            }
        }
        // Valeur existante sorti index de la première occurence
        System.out.println(SomeFunction.FirstIntInArray( myArrayInt, 9));
        // Valeur inexistante
        System.out.println(SomeFunction.FirstIntInArray( myArrayInt, 4));


        // Excercice 3
        System.out.println("\n");
        System.out.println("Excercice 3: inversion d'une chaîne de caractère");
        System.out.println(SomeFunction.InverseString("java interview"));

        // Excercice 4
        System.out.println("\n");
        System.out.println("Excercie 4 : Trouver la plus grande valeur d'un tableau");
        int[] tabInt = new int[4];
        tabInt[0] = 1 ;
        tabInt[1] = 31;
        tabInt[2] = 74 ;
        tabInt[3] = 47;
        System.out.println(SomeFunction.TheBiggerInt( tabInt ) );

        // Excercice 5
        System.out.println("\n");
        System.out.println("Excercie 5 : Multiple de 3 ou de 5");
        System.out.println(SomeFunction.IsModulo3ou5( 5 ));

        // Excercice 6
        System.out.println("\n");
        System.out.println("Excercice 6 : isPalindrome ");
        System.out.println("test du Mot ABBA " + SomeFunction.isPalindrome("ABBA"));
        System.out.println("test du Mot Papa " + SomeFunction.isPalindrome("Papa"));

        // Excercice 7
        SomeFunction.LeMotLePlusLong();


    }

}
