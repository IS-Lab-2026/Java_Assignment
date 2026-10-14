import java.util.Scanner; 
 
public class bicyclerentalcode { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
 
        System.out.print("Enter start time: "); 
        int start = input.nextInt(); 
 
        System.out.print("Enter end time: "); 
        int end = input.nextInt(); 
 
        if (start < 0 || start > 23 || end < 1 || end > 24) { 
            System.out.println("Invalid time entered."); 
        } else if (start >= end) { 
            System.out.println("Start time must be less than end time."); 
        } else { 
            int total = 0; 
 
            if (end <= 7) { 
                total = (end - start) * 500; 
            } else if (start >= 7 && end <= 14) { 
                total = (end - start) * 1000; 
            } else if (start >= 14 && end <= 19) { 
                total = (end - start) * 1500; 
            } else if (start >= 19 && end <= 21) { 
                total = (end - start) * 1000; 
            } else if (start >= 21) { 
                total = (end - start) * 500; 
            } else { 
                int h1 = 0; 
                int h2 = 0; 
                int h3 = 0; 
 
                if (start < 7) { 
                    if (end <= 7) { 
                        h1 = h1 + (end - start); 
                    } else { 
                        h1 = h1 + (7 - start); 
                    } 
                } 
 
                if (start < 14 && end > 7) { 
                    int s = start; 
                    int e = end; 
                    if (s < 7) { s = 7; } 
                    if (e > 14) { e = 14; } 
                    h2 = h2 + (e - s); 
                } 
 
                if (start < 19 && end > 14) { 
                    int s = start; 
                    int e = end; 
                    if (s < 14) { s = 14; } 
                    if (e > 19) { e = 19; } 
                    h3 = h3 + (e - s); 
                } 
 
                if (start < 21 && end > 19) { 
                    int s = start; 
                    int e = end; 
                    if (s < 19) { s = 19; } 
                    if (e > 21) { e = 21; } 
                    h2 = h2 + (e - s); 
                } 
 
                if (end > 21) { 
                    if (start >= 21) { 
                        h1 = h1 + (end - start); 
                    } else { 
                        h1 = h1 + (end - 21); 
                    } 
                } 
 
                total = (h1 * 500) + (h2 * 1000) + (h3 * 1500); 
            } 
 
            System.out.println("The total rent to pay is: " + total + " RWF"); 
        } 
    } 
} 
 
