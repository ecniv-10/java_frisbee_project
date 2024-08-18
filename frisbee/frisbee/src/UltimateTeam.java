import java.util.ArrayList;

public class UltimateTeam{
  private ArrayList<UltimatePlayer> players;
  private ArrayList<Coach> coaches;

   
  public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches) 
  {
    this.players = players;
    this.coaches = coaches;
  }


  public String getHandlers(){
    String handlers = "";

    for (UltimatePlayer player : players) {
        if (player.getPosition().equals("handler")) {
            handlers = handlers + player + "\n";            
        }
        
    }
    return handlers;
  }


  public String getCutters(){
    String cutters = "";

    for (UltimatePlayer player : players) {
        if (player.getPosition().equals("cutter")) {
            cutters = cutters + player + "\n";            
        }
        
    }
    return cutters;
  }

  public String toString() {
    String print_coaches = "COACHES\n" ;
    String print_players = "PLAYERS\n" ;


    //print coaches
    for (Coach coach : coaches) {
        print_coaches = print_coaches + coach + "\n";
    }

    //print players
    for (UltimatePlayer player : players) {
        print_players = print_players + player + "\n";
    }

    return print_coaches + "\n" + print_players;
  }
    
}

