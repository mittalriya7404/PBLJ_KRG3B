import java.util.*;

public class Main{
    public static void add(String name, ArrayList<String> list){
        list.add(name);
        System.out.println("Adding name: " + name);
    }
    public static void remove(String name, ArrayList<String> list) throws EmptyArrayException{
       if(list.size() == 0){
          throw new EmptyArrayException("List is empty. Cannot remove name.");
       }else{
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals(name)){
                list.remove(i);
                System.out.println("Removing name: " + name);
                return;
            }
        }
       }
    }
    public static void display(ArrayList<String> list) throws EmptyArrayException{
        if(list.size() == 0){
           throw new EmptyArrayException("Array is Empty");
        }else{
            Collections.sort(list);
            System.out.println("Names in the list:");
            for(String name : list){
                System.out.println(name);
            }
        }
    }
    public static void main(String[] args) throws EmptyArrayException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();
        boolean flag = true;
        while(flag){
            System.out.println("1.Add a name");
            System.out.println("2.Remove a name");
            System.out.println("3.Display all names");
            System.out.println("4.Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
           switch(choice){
               case 1:
                   System.out.print("Enter a name to add: ");
                   String nameToAdd = scanner.next();
                   add(nameToAdd,numbers);
                   break;
               case 2:
                   System.out.print("Enter a name to remove: ");
                   String nameToRemove = scanner.next();
                 remove(nameToRemove,numbers);
                   break;
               case 3:
                  display(numbers);
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