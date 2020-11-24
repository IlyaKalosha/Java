import java.time.Month;
import java.util.Scanner;

public class JavaFundamentals {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.nextLine();
        System.out.println("Hello " + name);

        for(int i = args.length-1; i >= 0; i--){
            System.out.print(args[i] + " ");
        }

        System.out.println("Enter random number");
        int size = in.nextInt();
        for(int i = 0; i < size; i++){
            System.out.print((i + 1)+" ");
        }
        System.out.println();
        for(int i = 0; i < size; i++){
            System.out.println(i + 1);
        }

        int argsSumm = 0;
        int argsMultiply = 1;

        for(int i = 0; i <= args.length-1; i++){
            argsSumm += Integer.parseInt(args[i]);
            argsMultiply *= Integer.parseInt(args[i]);
        }
        System.out.println("Sum of Arguments = "+ argsSumm);
        System.out.println("Multiply of Arguments = "+ argsMultiply);

        int monthNumber = 0;

        System.out.println("Enter month number");
        while(!in.hasNextInt()){
            System.out.println("\nWrong number");
            in.next();
        }
        
        monthNumber = in.nextInt();
        if(monthNumber>0 && monthNumber<13)
            System.out.println(Month.of(monthNumber).name());
        else{
            System.out.println("\nWrong number");
            in.next();
        }
    }
}
