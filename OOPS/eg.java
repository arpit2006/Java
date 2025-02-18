package OOPS;
class TommyVecetti{
    String hiting;
    String firing;
    String walking;
    public String hit(){
        return hiting;
    }
    public String fire(){
        return firing;
    }
    public String walk(){
        return walking;
    }
}


    public class eg {
        public static void main(String[] args) {
            TommyVecetti games = new TommyVecetti();

            games.hiting  = "Hiting";
            games.walking  = "Walking";
            games.firing  = "Firing";
            System.out.println(games.hiting);
            System.out.println(games.walking);
            System.out.println(games.firing);
        }
}
