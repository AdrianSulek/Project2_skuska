package Project2.runTime;

import Project2.models.Cell;
import Project2.models.Enemy;

public class Combat {
    Cell whiteCells = new Cell(20,1,2);
    Enemy HIV = new Enemy(5,1,1);
    Enemy AIDS = new Enemy(7,1,2);
    RunTime runTime = new RunTime();

    public void combatSystem(){

        float chanceAttackCell = (float) whiteCells.attackPower/10;
        float chanceDefenseCell = (float) whiteCells.defensePower/10;
        float chanceAttackEnemy = (float) HIV.attackPowerEnemy/10;
        float chanceDefenseEnemy = (float) HIV.defensePowerEnemy/10;

        System.out.println("--------NEW TURN--------");
        System.out.println("Number of white cells---->" + whiteCells.numberOfCells);
        System.out.println("Number of enemy cells---->"+HIV.numberOfEnemies);


        //WhiteCells turn to Attack
        for (int x = 0; x<1; x++){
            if (Math.random()+chanceAttackCell-chanceDefenseEnemy > 0.5){
                HIV.numberOfEnemies -= 1;
                System.out.println("White cell killed enemy ");
            }
        }

        //Enemy turn to Attack
        for (int x = 0; x<1; x++){
            if (Math.random()+chanceAttackEnemy-chanceDefenseCell > 0.5){
                whiteCells.numberOfCells -= 1;
                System.out.println("Enemy cell killed ally");
            }
        }


        if (HIV.numberOfEnemies == 0){
            System.out.println("You've won the battle");
            runTime.levelChooser(true);
            return;
        } else if (whiteCells.numberOfCells == 0) {
            System.out.println("You've lost the battle");
            runTime.levelChooser(false);
            return;
        }

        System.out.println("--------END OF TURN--------\n");

        combatSystem();
    }
}
