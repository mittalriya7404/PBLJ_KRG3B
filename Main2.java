import java.util.*;

class Main2{
    public static void add(int id, String name, HashMap<Integer, String> map){
        map.put(id,name);
        System.out.println("Name added successfully.");
    }
    public static void retrieve(int id, HashMap<Integer, String> map) throws IDNotFoundException{
      if(!map.containsKey(id)){
        throw new IDNotFoundException("ID not found.");
      }else{
        System.out.println("Name for id" +id+":"+ map.get(id));
    }
    }
    public static void display( HashMap<Integer, String> map){
        if(map.size() == 0){
              System.out.println("No names to display.");
        }else{
            System.out.println("Names in the list:");
            for(Map.Entry<Integer, String> entry : map.entrySet()){
                System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
            }
        }
    }
    public static void main(String[] args) throws IDNotFoundException {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        boolean flag = true;
        while(flag){
            System.out.println("1.Add a name");
            System.out.println("2.Retrieve a name");
            System.out.println("3.Display all names");
            System.out.println("4.Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
           switch(choice){
               case 1:
                   System.out.print("Enter ID and name to add: ");
                   int id= scanner.nextInt();
                   String nameToAdd = scanner.next();
                   add(id,nameToAdd,map);
                   break;
               case 2:
                   System.out.print("Enter id to retrieve: ");
                   int id2= scanner.nextInt();
                  retrieve(id2,map);
                   break;
               case 3:
                   display(map);
                   break;
               case 4:
                   flag = false;
                   System.out.println("Exiting...");
                   break;
               default:
                   System.out.println("Invalid choice. Please try again.");
           }
        }
    }
}