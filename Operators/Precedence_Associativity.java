public class Precedence_Associativity {
    public static void main(String[] args) {
        //Precedence
        //the condition of being considered more important than someone or
        // something else; priority in importance, order, or rank.

        //Associativity
        //a property of some binary operations that means that rearranging
        // the parentheses in an expression will not change the result.

        int a = 6*5-34/2; //first multiply then divide only precedence
        int b = 60/5-34*2; // left to right apply associativity(first divide then multiply)
        System.out.println(a);
        System.out.println(b);
    }
}
