public class Main {
    public static void main(String[] args){

        //Operador E de bit a bit = &
        //Operador OU de bit a bit + |
        //Operador OU Exclusivo (só dá verdadeiro com valores diferentes) = ^

        //Esses operadores são usados em programação de baixo nível

        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);

    }
}
