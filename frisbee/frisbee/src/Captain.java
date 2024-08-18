public class Captain extends UltimatePlayer {
    private boolean type; 

    public Captain(String firstName, String lastName, String position, boolean type) {
        super(firstName, lastName, position);
        this.type = type; 
    }


     public int throwDisc(int pow) {
        int power = Math.min(Math.max(pow, 1), 10);
        return power * 5 ;
    }

    public String toString() {
        String captain_type = "";
        if (this.type) {
            captain_type = "offense";
            
        } else {
            captain_type = "defense";
        }
        return super.toString() + "\n   Captain: " + captain_type;
    }
  
}

