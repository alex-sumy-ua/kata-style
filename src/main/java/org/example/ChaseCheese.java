package org.example;

import java.sql.SQLOutput;

public class ChaseCheese {

    public CheeseStorage evaluate(String way, int catSpeed, int mouseSpeed) { //  string / cat speed / mouse speed
        CheeseStorage result = CheeseStorage.CHEESE_PARTY; // we are optimists - default is a party

        // to create three positions
        int catPosition = 0;
        int mousePosition = 0;
        int cheesePosition = 0;

        // to determine three positions
        for (int i = 0; i < way.length(); i++) {
            if (way.charAt(i) == 'K') catPosition = i;
            if (way.charAt(i) == 'M') mousePosition = i;
            if (way.charAt(i) == 'C') cheesePosition = i;
        }
        // number of steps for the cat and for the mouse to reach the cheese
        double catSteps = (cheesePosition - catPosition);
        double mouseSteps = (cheesePosition - mousePosition);

        // taking into account the speeds
        if (catSpeed == 0) catSteps = 2147483647;
        else catSteps = (double)catSteps / catSpeed;
        if (mouseSpeed == 0) mouseSteps = 2147483647;
        else mouseSteps = (double)mouseSteps / mouseSpeed;

        // to compare
        if (catSteps < mouseSteps) result = CheeseStorage.NO_CHEESE;
        else if (catSteps == mouseSteps) result = CheeseStorage.CHEESE_PARTY;
        else  result = CheeseStorage.CHEESE;

        return result;
    }

}
