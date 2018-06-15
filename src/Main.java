import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static Person person = new Person();
    static ArrayList<Education> Schools = new ArrayList<>();
    static ArrayList<Job> Jobs = new ArrayList<>();
    static ArrayList<Skill> Skills = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);
    static boolean quit = false;

    //URL url = getClass().getResource("Resume.txt");
    //File file = new File(url.getPath());
    // Declare new file to write to
    static File file = new File("C:\\Users\\GBTC440013UR\\IdeaProjects\\WeekThreeFridayProject\\Resume.txt");

    public static void main(String[] args) {

        getPerson(person);
        getEducation();
        getJobs();
        getSkills();

        // Prints resume to console
        printResume();

        // Writes resume to file
        writeToFile();
    }

    // getPerson()
    // Get user's name and email
    protected static void getPerson(Person person){
        String name="", email="";

        System.out.println("This is a resume building app, please enter the information prompted for. Thank you.\n");

        // Prompt user for name
        System.out.printf("Enter your name: ");
        name = sc.nextLine();

        // Check to make sure input is not blank
        if (name.isEmpty()) {
            do {
                System.out.printf("Name is blank, enter name: ");
                name = sc.nextLine();
            } while(name.isEmpty());
        }

        // Set person's name
        person.setName(name);

        System.out.printf("Enter your email: ");
        email = sc.nextLine();

        if (email.isEmpty()) {
            do {
                System.out.printf("Email is blank, enter email: ");
                email = sc.nextLine();
            } while(email.isEmpty());
        }

        person.setEmail(email);
    }

    // getEducation()
    // Get user's education info (degree, school and year commenced)
    // Validates user input to make sure it's not blank
    protected static void getEducation() {
        String input = "";
        String degree = "", major = "", school = "", year = "";
        quit = false;

        System.out.println("\nEDUCATION INFORMATION:\n");

        do {
            do {
                System.out.printf("Enter (N) new education or (Q) to quit: ");
                input = sc.nextLine();
            } while(input.isEmpty());

            if (!input.equalsIgnoreCase("Q")) {
                System.out.printf("Enter type of degree: ");
                degree = sc.nextLine();

                if (degree.isEmpty()) {
                    do {
                        System.out.printf("Degree is blank, enter degree: ");
                        degree = sc.nextLine();
                    } while(degree.isEmpty());
                }

                System.out.printf("Enter name of major: ");
                major = sc.nextLine();

                if (major.isEmpty()) {
                    do {
                        System.out.printf("Major is blank, enter major: ");
                        major = sc.nextLine();
                    } while(major.isEmpty());
                }

                System.out.printf("Enter name of school: ");
                school = sc.nextLine();

                if (school.isEmpty()) {
                    do {
                        System.out.printf("School is blank, enter school: ");
                        school = sc.nextLine();
                    } while(school.isEmpty());
                }

                System.out.printf("Enter year graduated: ");
                year = sc.nextLine();

                if (year.isEmpty()) {
                    do {
                        System.out.printf("Year is blank, enter year: ");
                        year = sc.nextLine();
                    } while(year.isEmpty());
                }

                Schools.add(new Education(degree, major, school, year));
            }
            else {
                quit = true;
            }
        }while(quit == false);
    }

    // getJobs()
    // Get user's job experience (job title, company, dates of employment)
    // Validates user input to make sure it's not blank
    protected static void getJobs() {
        String input = "";
        String title = "", company = "", start = "", end = "", duty = "";

        // List holds list of job duties for each job held
        ArrayList<String> Duties = new ArrayList<>();
        quit = false;

        System.out.println("\nJOB EXPERIENCE\n");

        do {
            do {
                System.out.printf("Enter (N) new job or (Q) to quit: ");
                input = sc.nextLine();
            } while(input.isEmpty());

            if (!input.equalsIgnoreCase("Q")) {
                System.out.printf("Enter job title: ");
                title = sc.nextLine();

                if (title.isEmpty()) {
                    do {
                        System.out.printf("Job title is blank, enter job title: ");
                        title = sc.nextLine();
                    } while(title.isEmpty());
                }

                System.out.printf("Enter name of company: ");
                company = sc.nextLine();

                if (company.isEmpty()) {
                    do {
                        System.out.printf("Company name is blank, enter company name: ");
                        company = sc.nextLine();
                    } while(company.isEmpty());
                }

                System.out.printf("Enter month and year started: ");
                start = sc.nextLine();

                if (start.isEmpty()) {
                    do {
                        System.out.printf("Start date is blank, enter start date: ");
                        start = sc.nextLine();
                    } while(start.isEmpty());
                }

                System.out.printf("Enter month and year ended: ");
                end = sc.nextLine();

                if (end.isEmpty()) {
                    do {
                        System.out.printf("End date is blank, enter end date: ");
                        end = sc.nextLine();
                    } while(end.isEmpty());
                }

                System.out.println();

                // Reset list of job duties so they are not appended to
                // other job duties of previous job entered
                Duties.clear();

                do {
                    //Reset duty so loop won't be skipped on subsequent runs
                    duty = "";

                    do {
                        System.out.printf("Enter new job duty or (F) to finish entering job duties: ");
                        duty = sc.nextLine();
                    } while(duty.isEmpty());

                    if(duty.equalsIgnoreCase("F")){
                        break;
                    }
                    else {
                        Duties.add(duty);
                    }
                } while(!duty.equalsIgnoreCase("F"));

                System.out.println("");

                // Add new job to list
                Jobs.add(new Job(title, company, start, end, Duties));
            }
            else {
                quit = true;
            }
        }while(quit == false);
    }

    // getSkills()
    // Get user's skills and their level of proficiency for each skill
    // Validates user input to make sure it's not blank
    protected static void getSkills() {
        String input = "";
        String skillName = "", skillRate = "";
        quit = false;

        System.out.println("\nSKILLS:\n");

        do {
            do {
                System.out.printf("Enter (N) new skill or (Q) to quit: ");
                input = sc.nextLine();
            } while(input.isEmpty());

            if (!input.equalsIgnoreCase("Q")) {
                System.out.printf("Enter type of skill: ");
                skillName = sc.nextLine();

                if (skillName.isEmpty()) {
                    do {
                        System.out.printf("Skill is blank, enter skill: ");
                        skillName = sc.nextLine();
                    } while(skillName.isEmpty());
                }

                System.out.printf("Enter skill rating: ");
                skillRate = sc.nextLine();

                if (skillRate.isEmpty()) {
                    do {
                        System.out.printf("Skill rating is blank, enter skill rating: ");
                        skillRate = sc.nextLine();
                    } while(skillRate.isEmpty());
                }

                Skills.add(new Skill(skillName, skillRate));
            }
            else {
                quit = true;
            }
        }while(quit == false);
    }

    // printResume()
    // Prints user info to console
    protected static void printResume() {

        int count;

        System.out.println("\n======================================");
        System.out.println("RESUME");
        System.out.println("======================================\n");
        System.out.println(person.name);
        System.out.println(person.email);

        System.out.println("\nEDUCATION");
        for(Education school:Schools) {
            System.out.println(school.type_of_degree + " in " + school.name_of_major + ",");
            System.out.println(school.school + ", " + school.year_graduated);
            System.out.println();
        }

        System.out.println("\nEXPERIENCE");
        for(Job job:Jobs) {
            System.out.println(job.title);
            System.out.println(job.company + ", " + job.start_date + " - " + job.end_date);

            // Reset counter
            count = 1;

            for(String s:job.Duties){
                System.out.println("- Duty " + count + ", " + s);
                count++;
            }

            System.out.println();
        }

        System.out.println("\nSKILLS");
        for(Skill skill:Skills) {
            System.out.println(skill.skill_desc + ", " + skill.skill_rating);
        }
    }

    // writeToFile()
    // Writes user info to file
    protected static void writeToFile() {

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            int count;

            bw.write("\n======================================\n");
            bw.write("RESUME");
            bw.write("\n======================================\n");

            bw.write(person.name + "\n");
            bw.write(person.email);
            bw.newLine();

            bw.write("\nEDUCATION\n");
            for (Education school : Schools) {
                bw.write(school.type_of_degree + " in " + school.name_of_major + ",");
                bw.newLine();
                bw.write(school.school + ", " + school.year_graduated);
                bw.write("\n\n");
            }

            bw.write("\nEXPERIENCE\n");
            for (Job job : Jobs) {
                bw.write(job.title);
                bw.newLine();
                bw.write(job.company + ", " + job.start_date + " - " + job.end_date);

                // Reset counter
                count = 1;

                for (String s : job.Duties) {
                    bw.newLine();
                    bw.write("- Duty " + count + ", " + s);
                    count++;
                }

                bw.write("\n\n");
            }

            bw.write("\nSKILLS\n");
            for (Skill skill : Skills) {
                bw.newLine();
                bw.write(skill.skill_desc + ", " + skill.skill_rating);
            }

            bw.close();
        }
        catch(IOException e) {
            System.out.println("Error..");
        }
        finally {

        }

    }


}
