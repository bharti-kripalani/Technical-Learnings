/* Java has string class and it has a lot of functions. 
It lists the method and function that it will perform. 
Here is the list of string functions that you can utilize as per different use-cases */

String S = new String("This is a new is language");
S.charAt(0); //Finds the character as location 0
S.compareTo(S1); //It will compare the strings S and S1
S.concat(S); //It will concat the string S to itself.
If S = "xyz", then concat will result into xyzxyz
S.contains("new"); //It will find out if the string S contains substring "new"
S.contentEquals("This is new"); //It will find out if String S is equal to the inputted string.
S.endsWith("uage"); //It will find out if the String S ends with 'uage'
S.equals(S); //Will compare 2 strings.
S.getClass().getName();
S.hashCode(); //It will compute the hashcode of the string
S.indexOf('T'); //It will find the index of character 'T'
S.indexOf("This"); //It will find the index of String "this"
S.indexOf("s", 4); //It will find location of character s from location 4.
S.indexOf("is", 10); //It will find location of string 'is' starting from location 10.
S.isEmpty(); //It find out if the string is empty or not
S.lastIndexOf(s); //Will find the location of character s starting from end of string.
S.lastIndexOf("is"); //Will find the location of string 'is' starting from end of string.
S.lastIndexOf(s, 10);
S.lastIndexOf("is",10);
S.length(); //Find the length of the string
S.replace(s, e); //It will replace character s with e in the string
S.replace("new", "old"); //It will replace occurence of string new to old.
S.replaceAll("is", "was"); //Will replace all
S.replaceFirst("is", "was"); //Will only replace First occurence of string 'is'
S.substring(10); //Find a substring from character 10
S.substring(10, 16); //Find a substring from character 10 to 16
S.toLowerCase(); //Converts all characters to lowercase
S.toUpperCase(); //Converts all characters to uppercase
S.trim(); //Trims the leading and trailing whitespaces;
S.copyValueOf(c); //Creates a copy of string
S.copyValueOf(c, 0, 5); //Creates a copy of string from character 0 to 5

//How to convert a string to a character array:
char[] c = new char[20];
c = S.toCharArray(); //Converts a string to a character array

//How to get character from specific locations in the character array
char[] destChar = new char[10];
S.getChars(0, 10, destChar, 0); //It will get characters from location 0 to 10 into destination character array
