public class Coach extends Person {
    private String Role; 
  
    public Coach(String firstName, String lastName, String role)
    {
      super(firstName, lastName);
      Role = role;
      
    }
    
  
    public String toString()
    {
      return super.toString() + "\n   Role: " + Role;
    }
  
    
}
