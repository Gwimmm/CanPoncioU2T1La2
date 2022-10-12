public class ChaBotRunner {
    public static void main(String[] args) {

        ChatBot debbie = new ChatBot("Folwell", 73 );

        debbie.greeting("Folwell");
        System.out.println( debbie.addNumbers(1, 2, 3)) ;
        debbie.weather();
        debbie.convertFeetToMeters(13);
        debbie.favoriteNumber(4);
        System.out.println(debbie.goodbye());


    }
}
