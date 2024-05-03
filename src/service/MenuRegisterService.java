package service;

import config.Config;
import config.GlobalData;
import menu.Menu;
import model.Contestant;
import service.imple.MenuRegisterServiceImple;
import util.FileUtility;
import util.InputUtil;

import java.io.IOException;
import java.util.ArrayList;

public class MenuRegisterService implements MenuRegisterServiceImple {
    @Override
    public void process() throws IOException {
        System.out.println("======| REGISTER COMPETITOR |======  ");

        int howCompetitor = InputUtil.InputRequiredInt("How to want Competitor add? ");
        GlobalData.contestantList = new ArrayList<>(howCompetitor);

        System.out.println("===================================");

        for (int i = 0; i < howCompetitor; i++) {

            String name = InputUtil.InputRequiredStr("Name:");
            String surname = InputUtil.InputRequiredStr("Surname: ");
            String username = InputUtil.InputRequiredStr("Username: ");
            int id = Config.randomNum();

            Contestant contestant = new Contestant(name, surname, username, id);

            GlobalData.contestantList.add((contestant));

            System.out.println("===================================");

            FileUtility.write();

        }
        System.out.println("Register is Successfully!");
        Menu.showMenu();
    }
}
