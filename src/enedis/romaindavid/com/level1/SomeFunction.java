package enedis.romaindavid.com.level1;



import java.util.ArrayList;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class SomeFunction {

    /**
     * Excercice 1 : Fonction qui calcul le factoriel d'un nombre
     * Par méthode récursive tant que n !=0 on boucle
     * @param n  Nombre à calcul
     * @return
     */
    public static int factorial(int n ){

        if( n == 0 )
            return 1;
        else
            return (n * factorial(n-1) );

    }

    /**
     * Excercice 2 :  Utilisation d'une collection
     * @param intArray
     * @param n
     * @return
     */
    public static int firstIntInArray(int[] intArray,int n){

        int firstInt = -1;
        int indexOf = 0;

        for (int i: intArray ) {
            if (i == n)
                return indexOf;

            indexOf++;
        }
        return  firstInt;
    }

    /**
     * Excercice 3 :Inverser les caractères du chaîne
     * Utilisation de StringBuffer
     * @param value
     * @return
     */
    public static String inverseString(String value ){
        String reverseValue = "";
        int lengthValue = value.length() - 1;
        String[] values = value.split("");

        for(int i = lengthValue; i >= 0; i-- )
            reverseValue += values[ i ];

        return  reverseValue;
    }

    /**
     * Excercice 4 : Trouver le nombre le  plus grande dans un tableau de valeur
     * @param tab
     * @return
     */
    public static int theBiggerInt(int[] tab){
        int biggerInt = -1;
        int lengthTab = tab.length - 1 ;

        for(int i = 0; i<= lengthTab; i++)
            if( tab[i] > biggerInt)
                biggerInt = tab[ i ];

        return biggerInt;
    }

    /**
     *  Excercice 5 : Multiple de 3 ou 5
     * @param n
     * @return
     */
    public static String isModulo3ou5(int n ){
        String IsModulo = "";
        if( n % 3 == 0)
            IsModulo += "Fizz";

        if( n % 5 == 0)
            IsModulo += "Buzz";

        if(IsModulo == "")
            return null;
        else
            return IsModulo;

    }

    /**
     * Excercie 6 : Vérification si une chaine de caractère est un palimdrome
     * On s'appui sur la méthode InverseString ci dessus
     * @param value
     * @return
     */
    public static boolean isPalindrome(String value ){
        if ( value.equals( inverseString( value ) ) )
            return true;
        else
            return false;
    }

    /**
     * Excercice 7 & 8
     * on s'appui sur les méthodes de la class
     */

    public static void leMotLePlusLong( String maPhrase ){
        String biggerMot = "";
        String[] tab = maPhrase.split(" ");
        for (String mot: tab )
            if (mot.length()> biggerMot.length() )
                biggerMot = mot ;

        System.out.println( "Le premier mot le plus long est " + biggerMot );

    }


}

