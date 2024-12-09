import java.util.Scanner;
public class projectCaseStudyGroup5 {
    public static void inputData(){
        Scanner input = new Scanner(System.in);
        String[] fields = {"Name", "NIM", "Achievement Type", "Achievement Level (Local, National, International)", "Achievement Year"};
        String[] inputData = new String[5];

        for (int i = 0; i < fields.length; i++) {
            System.out.print("Enter " + fields[i] + ": ");
            inputData[i] = input.nextLine();
        }

        String level = inputData[3];
        while (!(level.equalsIgnoreCase("Local") || level.equalsIgnoreCase("National") || level.equalsIgnoreCase("International"))) {
            System.out.print("Invalid level! Please enter Local, National, or International: ");
            level = input.nextLine();
        }

        int year = 0;
        int currentYear = 2024;

    }
    public static void main(String[] args) {
        String [][] achievements = new String [2][5];
        inputData();
    }
    
}