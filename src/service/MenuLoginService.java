package service;

import config.Config;
import menu.Menu;
import service.imple.MenuLoginServiceImpl;
import util.InputUtil;

import java.io.IOException;

public class MenuLoginService implements MenuLoginServiceImpl {
    @Override
    public void process() throws IOException {
        System.out.println("======| LOGIN |======");

        int attempCount = 0;
        while (attempCount < 3) {

        String username = InputUtil.InputRequiredStr("USERNAME: ");
        String password = InputUtil.InputRequiredStr("PASSWORD: ");




            if ((username.equals("Admin")) && (password.equals("admin"))) {
                Config.setLoggedIn(true);


                System.out.println("LOGIN SUCCESFULLY!");
                Menu.showMenu();
                break;

            } else {
                System.out.println("Incorrect username or password. Please try again...");
                attempCount++;
            }
            if (attempCount == 3) {
                Config.blockedUser();
            }
        }


    }
}

