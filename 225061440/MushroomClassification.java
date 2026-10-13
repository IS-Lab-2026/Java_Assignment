
import java.util.Scanner;

public class MushroomClassification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer;

        System.out.print(
            
        );
        answer = input.nextLine().trim().toLowerCase();

        if (answer.equals("no")) {
            System.out.println(
                
            );

        } else {
            System.out.print(
                
            );
            answer = input.nextLine().trim().toLowerCase();

            if (answer.equals("no")) {
                System.out.print(
                    
                );
                answer = input.nextLine().trim().toLowerCase();

                if (answer.equals("yes")) {
                    System.out.println(
                        
                    );
                } else {
                    System.out.println(
                        
                    );
                }

            } else {
                System.out.print(
                  
                );
                answer = input.nextLine().trim().toLowerCase();

                if (answer.equals("yes")) {
                    System.out.println(
                        
                    );

                } else {
                    System.out.print(
                        
                    );
                    answer = input.nextLine().trim().toLowerCase();

                    if (answer.equals("yes")) {
                        System.out.println(
                           
                        );
                    } else {
                        System.out.println(
                            
                        );
                    }
                }
            }
        }

        input.close();
    }
}
