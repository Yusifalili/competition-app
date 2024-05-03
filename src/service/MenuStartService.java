package service;

import config.GlobalData;
import menu.Menu;
import model.Contestant;
import service.imple.MenuStartServiceImple;
import util.InputUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class MenuStartService implements MenuStartServiceImple {
    @Override
    public void process() throws IOException {

        System.out.println("======| START |======");


        System.out.println("GUESS THE CHOSEN PERSON :) ");

        ArrayList<Contestant> contestantList = GlobalData.contestantList;
        System.out.println(contestantList);


        int selectedPerson = InputUtil.InputRequiredInt("Who do you think is the chosen one?");

        Random random = new Random();
        int selectSystem = random.nextInt(1,selectedPerson );

            if (selectedPerson == selectSystem ) {
                System.out.println("Congratulations you won!");
            } else {
                System.out.println("You Failed, selected person number: " + selectSystem);
            }


        Menu.showMenu();
        }
}

