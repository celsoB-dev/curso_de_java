public class Main {
    public static void main (String[] args) {

        String original = "asDJNSDJ asfwfwiafsn   ";
        String str01 = original.toLowerCase();  //Declara uma variável que atribui ao seu valor à
                                                //string "original" com caracteres em MINÚSCULO

        String str02 = original.toUpperCase();  //Declara uma variável que atribui ao seu valor à
                                                //string "original" com caracteres em MAIÚSCULO

        String str03 = original.trim();         //Remove os espaços em branco

        String str04 = original.substring(2);   //Recorta a string a partir de um caractere


        String str05 = original.substring(2, 9);    //Recorta uma string indicando início e fim

        String str06 = original.replace('f', 'h');

        String str07 = original.replace("adf", "xyz");

        int i = original.indexOf("as");

        int j = original.lastIndexOf("as");

        String s = "alfa beta sigma";

        String[] vect = s.split(" ");

        System.out.println("toLowerCase: -" + str01 + "-");
        System.out.println("toLowerCase: -" + str02 + "-");
        System.out.println("trim: -" + str03 + "-");
        System.out.println("substring(2): -" + str04 + "-");
        System.out.println("substring(2, 9): -" + str05 + "-");
        System.out.println("replace(f, h): -" + str06 + "-");
        System.out.println("replace(adf, xyz): -" + str07 + "-");
        System.out.println("indexOf(as): " + i);
        System.out.println("lastIndexOf(as): " + j);

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(s);

    }
}
