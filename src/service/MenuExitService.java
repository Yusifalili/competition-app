package service;

import service.imple.MenuExitServiceImple;

public class MenuExitService implements MenuExitServiceImple {
    @Override
    public void process() {
        System.exit(-1);
    }
}
