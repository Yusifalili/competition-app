package service;

import service.imple.MenuLogoutServiceImple;
import service.imple.MenuService;

import java.io.IOException;

public class MenuLogoutService implements MenuLogoutServiceImple {
    @Override
    public void process() throws IOException{
        MenuLoginService menuLoginService = new MenuLoginService();
        menuLoginService.process();
    }
}
