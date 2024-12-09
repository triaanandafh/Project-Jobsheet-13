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
                    for (int i = 0; i < achievementData.length; i++) {
                        System.out.print("Enter Student Name: ");
                        achievementData[i][0] = sc.next();
                        System.out.print("Enter Student NIM: ");
                        achievementData[i][1] = sc.next();
                        System.out.print("Enter Type of Achievement: ");
                        achievementData[i][2] = sc.next();

                        String achievementLevel = " ";
                        while (true) { 
                            System.out.print("Enter Achievement Level (Local/National/International): ");
                            achievementLevel = sc.next();
                            if(achievementLevel.equalsIgnoreCase("Local") || achievementLevel.equalsIgnoreCase("National") || achievementLevel.equalsIgnoreCase("International")){
                                break;
                            }else{
                                sc.nextLine();
                                System.out.println("Invalid input. Please enter the right level of achievement!");
                            }                         
                        }
                        achievementData[i][3] = achievementLevel;

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
                        achievementData[i][4] = Integer.toString(years);

                        System.out.println("Achievement data is added successfully");
                        break;
                        }
                    }else if(select == 2){
                        
                    }
            }
        }
        public static void main(String[] args) {
        String [][] achievementData = new String[2][5];
        
        inputValidation(achievementData);
        }
    }