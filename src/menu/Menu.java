package menu;

import config.Config;
import service.*;
import service.imple.MenuService;
import util.InputUtil;

import java.io.IOException;


public enum Menu {

    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER_CONTESTANT(2, "Register", new MenuRegisterService()),
    STRAT(3, "Start", new MenuStartService()),
    LOGOUT(4, "Logout", new MenuLogoutService()),
    EXIT(5, "Exit", new MenuExitService()),
    UNKONOWN;
    private int number;
    private String label;

    private MenuService service;


    Menu() {

    }

    Menu(int number, String label, MenuService service) {
        this.number = number;
        this.label = label;
        this.service = service;
    }


    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public MenuService getService() {
        return service;
    }

    public void setService(MenuService service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "[" + number + "] " + label;
    }

    public void process() throws IOException {
        service.process();
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return UNKONOWN;
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != UNKONOWN) {
                if (menus[i] == LOGIN) {
                    if (!Config.isLoggedIn()) {
                        System.out.println(menus[i]);
                    }
                } else if (Config.isLoggedIn()) {
                    System.out.println(menus[i]);
                }
            }
        }
    }


    public static void showMenu() throws IOException {
        showAllMenu();

        int selectMenuNum = InputUtil.InputRequiredInt(" PLEASE SELECT OPTION: ");

        Menu selectMenu = Menu.find(selectMenuNum);
        selectMenu.process();
    }


}
