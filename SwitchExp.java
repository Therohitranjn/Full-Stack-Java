package JavaNewFeatures;
import java.util.Scanner;
public class SwitchExp {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String day = sc.nextLine();

        switch (day){

            case "mon" , "tue" ,"wed" , "thu" , "fri" -> System.out.println("Working Day");
       case "sat", "sun" -> System.out.println("Holiday");
            default -> System.out.println("Invalid Day");
        }
    }
}
