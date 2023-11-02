
public class Node {
    String name;
    String surname;
    String identity;
    String department;
    String country;
    
    Node next;

    public Node(String name, String surname, String identity, String department) {
        this.name = name;
        this.surname = surname;
        this.identity = identity;
        this.department = department;
        
        if(identity.startsWith("27")){
            this.country = "turkey";
        }else{
            this.country = "suri";
        }
    }
    
}
