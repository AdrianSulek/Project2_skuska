package Project2.runTime;

import java.util.Scanner;

public class RunTime {


    public String inputAnswer(){    //Beriem input tu
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public void run(){
        System.out.println("--------//#-WHITE CELLS ARMAGEDON-#\\\\--------");
        System.out.println("Welcome dear white cells, you found yourselves in very peculiar position\n");
        System.out.println("The body you are in is very sick, your mission is to eliminate all the threats along the way\n");
        System.out.println("Do you wish to start?   Y/N");
        String answ=inputAnswer();
        if (answ.equals("Y")){
            System.out.println("TAK LETSSSS GOOOOOo");
            level1();
        }
    }

    public void levelChooser(Boolean battleEnd){
        if (battleEnd == true){
            level2();
        }
    }
    public void level1(){
        System.out.println("Welcome to the head, here you will encounter your first enemy");
        Combat combat = new Combat();
        combat.combatSystem();
    }
    public void level2(){
        System.out.println("Welcome to the throat, be ready for your second enemy");
    }
}