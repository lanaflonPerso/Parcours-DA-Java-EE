package enedis.romaindavid.com.Level_1;



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
    public static int FirstIntInArray(List<Integer> intArray,int n){

        return intArray.indexOf( n );

    }

    /**
     * Excercice 3 :Inverser les caractères du chaîne
     * Utilisation de StringBuffer
     * @param value
     * @return
     */
    public static String InverseString(String value ){
        StringBuffer values =  new StringBuffer( value ) ;
       return values.reverse().toString();

    }

    /**
     * Excercice 4 : Trouver le nombre le  plus grande dans un tableau de valeur
     * @param tab
     * @return
     */
    public static int TheBiggerInt(int[] tab){
        OptionalInt max = IntStream.of(tab).max();
        return  max.getAsInt();
    }

    /**
     *  Excercice 5 : Multiple de 3 ou 5
     * @param n
     * @return
     */
    public static String IsModulo3ou5(int n ){
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
        if ( value.equals( InverseString( value ) ) )
            return true;
        else
            return false;
    }

    /**
     * Excercice 7 & 8
     * on s'appui sur les méthodes de la class
     */

    public static void LeMotLePlusLong( String maPhrase ){


        String[] tab = maPhrase.split(" ");

        List<Integer> myArrayInt = new ArrayList<Integer>();

        for (String len: tab )
            myArrayInt.add( len.length() ) ;

        int [] ints = myArrayInt.stream().mapToInt(Integer::intValue).toArray();

        System.out.println( "Le premier mot le plus long est " + tab[ FirstIntInArray( myArrayInt,TheBiggerInt( ints ) )  ] );

    }


}

