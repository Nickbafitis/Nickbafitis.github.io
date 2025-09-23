import java.util.Scanner;
import java.util.Arrays;
public class Ivy League{
    public static void main(String[]args){
        System.outprintln("please list 5 interests so I can associate you with the correct Ivy league")
System.out.println("choose out of these interest(make sure there are no spaces on the outside unless they are on the inside and they seperate two words):")
System.out.println(" Leadership, politics, biotech, economics, philosophy, Law, global affairs, humanities, arts, writing,math,
  physics, public policy, philosophy, Urban studies, journalism, international
   relations, performing arts, Business (Wharton), finance, healthcare management,
    entrepreneurship, Creative arts, open curriculum, interdisciplinary studies, 
    social justice, Environmental science, undergrad-focused research, liberal arts, outdoorsy culture, Engineering,
     architecture, agriculture, hotel management, tech innovation")
String[] Harvard = {"Leadership","politics","biotech","economics","philosophy"};
String[] Yale = { "Law", "global affairs", "humanities", "arts", "writing"};
String[] Princeton = {"math",  "physics", "public policy", "philosophy"};
String[] Columbia = {"Urban studies", "journalism", "international relations", "performing arts"};
String[] UPenn = {"Business (Wharton)", "finance", "healthcare management", "entrepreneurship"};
String[] Brown = {"Creative arts", "open curriculum", "interdisciplinary studies", "social justice"};
String[] Dartmouth = {"Environmental science", "undergrad-focused research", "liberal arts", "outdoorsy culture"};
String[] Cornell = {"Engineering","architecture", "agriculture", "hotel management", "tech innovation"};
String[][] allUniversities = {Harvard,Yale,Princeton,Columbia,UPenn,Brown,Dartmouth,Cornell};
Scanner input1 = new Scanner(System.in);
System.out.println("Enter interest 1");
String interest1 = input1.nextLine();
Scanner input2 = new Scanner(System.in);
System.out.println("Enter interest 2");
String interest2 = input2.nextLine();
Scanner input3 = new Scanner(System.in);
System.out.println("Enter interest 3");
String interest3 = input3.nextLine();
Scanner input4 = new Scanner(System.in);
System.out.println("Enter interest 4");
String interest4 = input4.nextLine();
Scanner input5 = new Scanner(System.in);
System.out.println("Enter interest 5");
String interest5 = input5.nextLine();
String[] totalInterests = {interest1, interest2, interest3, interest4, interest5};
int harvardScore = 0;
int yaleScore = 0;
int princetonScore = 0;
int columbiaScore = 0;
int upennScore = 0;
int brownScore = 0;
int dartmouthScore = 0;
int cornellScore = 0;
for (totalInterests : Harvard){
    harvardScore+=1;
};
for (totalInterests : Yale){
    yaleScore+=1;
};
for (totalInterests : Princeton){
    princetonScore+=1;
};
for (totalInterests : Columbia){
    columbiaScore+=1;
};
for (totalInterests : UPenn){
    upennScore+=1;
};
for (totalInterests : Brown){
   brownScoree+=1;
};
for (totalInterests : Dartmouth){
    dartmouthScore+=1;
};
for (totalInterests : Cornell){
    cornellScore+=1;
};
maxValue = (Math.max(harvardScore,yaleScore,princetonScore,columbiaScore,upennScore,brownScore,dartmouthScore,cornellScore ));
    if (harvardScore == maxValue){
        System.out.println("the Ivy league school best fit for you is Harvard");
    }
if (yaleScore == maxValue){
        System.out.println("the Ivy league school best fit for you is Yale");
    }
    else-if (princetonScore == maxValue){
        System.out.println("the Ivy league school best fit for you is Princeton");
    }
    else-if (columbiaScoreScore == maxValue){
        System.out.println("the Ivy league school best fit for you is Columbia");
    }
    else-if (upennScoreScore == maxValue){
        System.out.println("the Ivy league school best fit for you is UPenn");
    }
    else-if (brownScore == maxValue){
        System.out.println("the Ivy league school best fit for you is Brown");
    }
    else-if (dartmouthScoreScore == maxValue){
        System.out.println("the Ivy league school best fit for you is DartMouth");
    }
    else-if (cornellScoreScore == maxValue){
        System.out.println("the Ivy league school best fit for you is Cornell");
    }
    }
}