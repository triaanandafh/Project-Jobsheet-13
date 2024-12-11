import java.util.Scanner;
public class projectCaseStudyGroup5 {

    static void inputValidation(String [][] achievementData){
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("=== STUDENT ACHIEVEMENT RECORD ===");
            System.out.println("1. Add Achievement Data");
            System.out.println("2. Display All Achievements");
            System.out.println("3. Analysis of Achievements by Type");
            System.out.println("4. Exit");
            System.out.print("Select menu: ");
            int select = sc.nextInt();
            
            if(select == 1){
                inputAchievementData(achievementData);
            }else if(select == 2){
                displayAllAchievement(achievementData);
            }else if(select == 3){
                AnalyzeData(achievementData);
            }else if(select == 4){
                System.out.println("Program Completed. Thank you!");
                break;
            }else{
                System.out.println("Select one menu on the following list. Try again.\n");
            }
        }
    }

    static void inputAchievementData(String [][] achievementData){
        Scanner sc = new Scanner(System.in);
        if(index < achievementData.length){
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
                    System.out.println("Invalid input. Please enter the appropriate level as indicated.");
                }                         
            }
            achievementData[index][3] = achievementLevel;

            int years = 0;
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
            achievementData[index][4] = Integer.toString(years); //mengubah years menjadi String data type

            System.out.println("Achievement data is added successfully.\n");
            index++; 
        }else{
            System.out.println("List of achievement data is full.\n");
        }
    }

    static void displayAllAchievement(String [][] achievementData){
        boolean notNull = false;
        System.out.println();
        System.out.println("=== LIST OF ALL ACHIEVEMENT ===");
        for (int i = 0; i < achievementData.length; i++) {
            for(int j = 0; j < 1; j++){
                if(achievementData[i][j] != null && !achievementData[i][j].isEmpty()){
                    System.out.println("Name: " + achievementData[i][0]
                                        + " | NIM: " + achievementData[i][1]
                                        + " | Type: " + achievementData[i][2]
                                        + " | Level: " + achievementData[i][3]
                                        + " | Year: " + achievementData[i][4]);
                    notNull = true;
                }
            }
        }
        if(notNull){
            System.out.println("There is no achievement data yet.");
        }
        System.out.println();
    }

    static void AnalyzeData(String [][] achievementData){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type of achievement you want to analyze: ");
        String typeAchievementToAnalyze = sc.nextLine();

        System.out.println();

        System.out.println("=== ACHIEVEMENT ANALYSIS ===");
        boolean found = false;
        for (int i = 0; i < achievementData.length; i++) {
            if(achievementData[i][2] != null && achievementData[i][2].equalsIgnoreCase(typeAchievementToAnalyze)){
                System.out.println("Name: " + achievementData[i][0]
                                    + " | NIM: " + achievementData[i][1]
                                    + " | Level: " + achievementData[i][3]
                                    + " | Year: " + achievementData[i][4]);
                found = true;
            }
        }
        if(!found){
            System.out.println("No achievement found for the specified type.");
        }
        System.out.println();
    }

    static int index = 0;
    public static void main(String[] args) {
    String [][] achievementData = new String[10][5];

    inputValidation(achievementData);
    }
}