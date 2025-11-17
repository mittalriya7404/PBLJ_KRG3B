import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class eeeeee {
    public static void main(String[] args) throws InvalidAgeException{
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();
        if(age<18){
            throw new InvalidAgeException("Age is not valid");
        }
    }

}
