package com.tutorsdude.StringClass;

public class StringClass {
    public static void main(String[] args) {

        // 1. public int hashcode()

        String name = "abhi";

        int result = name.hashCode();
        System.out.println(result);

        // 2.public byte[] getBytes()

        byte[] result1 = name.getBytes();
        System.out.println(result1);

        // 3.public int indexOf(int ch)

        int result2 = name.indexOf('i');
        System.out.println(result2);

        //4.public String toLowerCase()

        String city = "BELGAVI";
        String result3 = city.toLowerCase();
        System.out.println(result3);

        // public String concat(String str)

        String firstName = "abhijeet";
        String lastName = "Ghorpade";
        String result4 = (firstName. concat(lastName));
        System.out.println(result4);

        // 6. public String replace(char oldChar,
        //                      char newChar)

        String food = "FriedRice";
        String result5 = food.replace('c','s');
        System.out.println(result5);

        // 7. public int codePointAt(int index)

        String flower = "rose";
        int result6 = flower.codePointAt(1);
        System.out.println(result6);

        // 8.public boolean contains(CharSequence s)

        boolean result7  = flower.contains("s");
        System.out.println(result7);


        // 9. public boolean startsWith(String prefix)


        boolean result8 = flower.startsWith("r");
        System.out.println(result8);

        // 10. public String toString()

        String result9 = flower.toString();
        System.out.println(result9);




        // String array problem

        String value = "Banglore";

        char[] charArr = value.toCharArray();

        String reversedString = "";

        for( int i=charArr.length-1; i>=0; i--){
            reversedString = reversedString + charArr[i];
        }

        System.out.println(reversedString);


        // String palindrome problem

        String palindrome = "malayalam";

        char[] charArray = palindrome.toCharArray();

        String reversString = "";

        for( int i = charArray.length-1; i<=0; i--){
            reversString = reversString + charArray[i];
        }

        if(reversString.equals(palindrome)){
            System.out.println("it is a palindrome");
        }

        else{
            System.out.println("it is not a palindrome");
        }
    }


}
