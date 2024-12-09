import java.util.Scanner;
public class projectJobsheet13 {
    

    static void inputValidation(String [][] achievementData){
        Scanner sc = new Scanner(System.in);
        int index = 0;
        while (true) { 
            System.out.println("\n=== STUDENT ACHIEVEMENT RECORD ===");
            System.out.println("1. Add Achievement Data");
            System.out.println("2. Display All Achievements");
            System.out.println("3. Analysis of Achievements by Type");
            System.out.println("4. Exit from the program");
            System.out.print("Select menu: ");
            int select = sc.nextInt();

            sc.nextLine();
            
            if(select == 1){
                    if (index < achievementData.length) {
                        System.out.print("Enter Student Name: ");
                        achievementData[index][0] = sc.nextLine();
                        System.out.print("Enter Student NIM: ");
                        achievementData[index][1] = sc.nextLine();
                        System.out.print("Enter Type of Achievement: ");
                        achievementData[index][2] = sc.nextLine();

                        String achievementLevel = " ";
                        while (true) { 
                            System.out.print("Enter Achievement Level (Local/National/International): ");
                            achievementLevel = sc.nextLine();
                            if(achievementLevel.equalsIgnoreCase("Local") || achievementLevel.equalsIgnoreCase("National") || achievementLevel.equalsIgnoreCase("International")){
                                break;
                            }else{
                                // sc.nextLine();
                                System.out.println("Invalid input. Please enter the right level of achievement!");
                            }                         
                        }
                        achievementData[index][3] = achievementLevel;

                        int years;
                        while (true) { 
                            System.out.print("Enter Year of Achievement (2010 - 2024): ");
                            years = sc.nextInt();
                            sc.nextLine();
                            if(years >= 2010 && years <= 2024){
                                break;
                            }else{
                                System.out.println("Invalid year. Try again.");
                            }
                        }
                        // sc.nextLine();
                        achievementData[index][4] = Integer.toString(years);

                        System.out.println("Achievement data is added successfully");
                        index++;
                    }else{
                        System.out.println("Achievement data array is full. Cannot add more data.");
                    }
                       
                    }else if(select == 2){
                        displayData(achievementData);
                        
                    }else if(select ==3){
                         analyzeData(achievementData);
                    }else{
                        System.out.println("Exiting the program. Thank you!!!!");
                    break;
                    }
            }
        }

        public static void displayData(String [][] achievementData){
            boolean hasData = false;  // Flag to check if there is any data
            System.out.println();
                        System.out.println("=== ALL ACHIEVEMENTS ===");
                        for (int i = 0; i < achievementData.length; i++) {
                            if (achievementData[i][0] != null && !achievementData[i][0].isEmpty()) {
                                // Only display if student name is not empty (i.e., data exists)
                                System.out.println("Name: " + achievementData[i][0] +
                            " | NIM: " + achievementData[i][1] +
                            " | Type: " + achievementData[i][2] +
                            " | Level: " + achievementData[i][3] +
                            " | Year: " + achievementData[i][4]);
                            hasData = true;
                        
                    }
                }
                if (!hasData) {
                    System.out.println("No data available.");
                }
                System.out.println();
        }

        public static void analyzeData(String [][] achievementData){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the type of achievement to analyze: ");
            String thingToAnalyze = sc.nextLine();
            System.out.println();
            System.out.println("=== ANALYZING ACHIEVEMENTS ===");
            boolean found = false;
                for (int i = 0; i < achievementData.length; i++) {
                    if (achievementData[i][2] != null && achievementData[i][2].equalsIgnoreCase(thingToAnalyze)) {
                        System.out.println("Name: " + achievementData[i][0] +
                                           " | NIM: " + achievementData[i][1] +
                                           " | Level: " + achievementData[i][3] +
                                           " | Year: " + achievementData[i][4]);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("No achievements found for the specified type.");
                }
                System.out.println();
        }
        
        public static void main(String[] args) {
        String [][] achievementData = new String[5][5];
        
        inputValidation(achievementData);
        }
    }

