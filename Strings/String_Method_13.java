public class String_Method_13 {
    public static void main(String[] args) {
//        String a = "Amit";
//        String b = new String("Sumedh");
//        System.out.println(a);

        //Length of String
        String name = "Arpit";
//        int value = name.length();
//        System.out.println(value);


        //they are creating duplicate value and then doing the operations
        // They are not using orignal string
        //String is Immutable

        //Convert to lowerCase
//        String L_case = name.toLowerCase();
//        System.out.println(L_case);

        //Convert to uppercase
//        String U_case = name.toUpperCase();
//        System.out.println(U_case);

        //Trim String (Removes Spaces)
//         String non_trimmed_str = "            Arpit        ";
//        String T_name = non_trimmed_str.trim();
//        System.out.println(T_name);

        // Substring (Removes Letter at given argument)
//        System.out.println(name.substring(1));

        //Substring with begin and ending index
//        System.out.println(name.substring(1,4));

        // Replace with old char and New char
//        System.out.println(name.replace('A','j'));
//        System.out.println(name.replace("Arp","Har"));

        //Starswith
//        System.out.println(name.startsWith("Ar"));
//
//        //Endswith
//        System.out.println(name.endsWith("it"));

        //indexing
//        System.out.println(name.charAt(1));

        //Index of return of specific position
//        System.out.println(name.indexOf("r"));
        //It will start seeing r from index 0
        System.out.println(name.indexOf("r",0));


    }
}
