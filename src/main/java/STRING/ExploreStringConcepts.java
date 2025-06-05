package STRING;

public class ExploreStringConcepts {

    public static void main(String[] args) {
        String s1 = "Hello"; //Literals
        String ss1 = "Hello"; // Refers to S1 in String pool (special memory area for string constants)
        String s2 = s1.concat("World");
        System.out.println(s1);
        System.out.println(s2);

        //String methods

        String str1= new String("Hello"); //Creates a new object

        //String length
        int length = str1.length();
        System.out.println("str1 length:"+length);

        //String concatenation
        String str2 = "World";
        String result = str1 + " " + str2;
        System.out.println("String concatenation:"+ result);

        //String replace
        String str = "jaxa";
        String replaced = str.replace('x','v');
        System.out.println("new replaced string:"+replaced);

        //Substring
        String subString = result.substring(0,5);
        System.out.println("Substring:"+subString);

        //get Character from specific position
        char c = str1.charAt(0); //using this to loop the string get each charecters
        System.out.println("Char At:"+c);

        //Check if 2 strings are equal in content
        String string1 = "Hello";
        String string2 = "Hello";
        boolean isEqual = string1.equals(string2);
        System.out.println("String is Equal? "+isEqual);

        //check if 2 strings are the same objects
        System.out.println("2 strings refering to same objects: "+(string1 == string2)); //String pool
        System.out.println("2 strings refering to same objects: "+(string1 == str1)); //str1 created using new keyword

        //compareTo : used to compare 2 strings lexicographically. it returns: 1. 0 if both strings are equal
        // 2. A +Ve number if the calling string is lexicographically greater. 3. A -ve number if its lexicographically smaller
        String st1 = "apple";
        String st2 = "banana";
        int compareToResult = st1.compareTo(st2); //-ve value because "apple" < "Bannana"
        System.out.println("compareToResult:"+compareToResult);

        //String intern() : method allows you to explicitly add strings to the String pool or get a reference to an existing in the pool
        String st11 = new String("Hello");
        String st12 = st11.intern();
        System.out.println("st11: "+st11 + " st12: "+st12);




        //Case Conversion
        System.out.println("To lower case: "+string1.toLowerCase());
        System.out.println("To Upper case: "+string1.toUpperCase());

        //index of charecter or substring
        int index = string1.indexOf('l');
        System.out.println("index of l in string1:"+index);

        //Trim string spaces
        String string3 = "    JAVA     ";
        System.out.println("Sting trim:"+string3.trim());

        /*
        StringBuilder: A mutable sequence of charecters. its faster and more efficient for concatenation or modification
        when compared to String, as it doesn't create new objects every time.

        StringBuffer: Similar to StringBuilder but it is Thread safe (Synchronised), which means it is safe to use in a
        multi-threaded environment.
         */
        StringBuilder stringBuilder=new StringBuilder("Hello");
        stringBuilder.append(" world");
        System.out.println("string Builder:"+ stringBuilder);

        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" world");
        System.out.println("String Buffer:"+stringBuffer);







    }
}
