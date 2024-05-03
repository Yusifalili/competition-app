package config;


import service.MenuExitService;
import service.MenuLogoutService;

import java.io.IOException;
import java.util.Random;

public class Config {

    public static boolean isBlocked;

    public static boolean LoggedIn;

    public static boolean isLoggedIn() {
        return LoggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        LoggedIn = loggedIn;
    }

    public static boolean isIsBlocked() {
        return isBlocked;
    }

    public static void setIsBlocked(boolean isBlocked) {
        Config.isBlocked = isBlocked;
    }

    public static int randomNum(){
        Random random = new Random();
        return random.nextInt(1,1000);
    }

    public static void blockedUser() throws IOException {
        setIsBlocked(true);
        System.out.println("You are Blocked!");
        System.exit(-1);



    }
}
