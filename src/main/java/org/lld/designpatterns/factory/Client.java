package org.lld.designpatterns.factory;

import org.lld.designpatterns.factory.components.button.Button;
import org.lld.designpatterns.factory.components.dropdown.Dropdown;
import org.lld.designpatterns.factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.IOS);
        UIFactory uiFactory= flutter.createUIFactory();
        Menu menu = uiFactory.createMenu();
        Dropdown dropdown = uiFactory.createDropDown();
        Button button = uiFactory.createButton();
    }
}
