public class UltimatePlayer extends Person {
    private int jerseyNumber;
    private String position;

    //  static variable that increments each time a UltimatePlayer object is created and used to 
    //  assign jersey numbers to the specific player
    private static int jerseyNumberCount = 1; 

    public UltimatePlayer(String firstName, String lastName, String position) {
        
        super(firstName, lastName);
        this.jerseyNumber = jerseyNumberCount;
        jerseyNumberCount++;


        if (!position.equals("handler") && !position.equals("cutter")) {
            this.position = "handler"; 
        } else {
            this.position = position;
        }
    }

    public String getPosition() {
        return position;
    }

    public int throwDisc(int pow) {
        int power = Math.min(Math.max(pow, 1), 10);
        return power * 4;
    }

    public String toString() {
        return super.toString() + "\n   Jersey #: " + jerseyNumber + "\n   Position: " + position;
    }

    
}
