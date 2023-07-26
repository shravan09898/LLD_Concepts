package org.lld.designpatterns.factory;

import org.lld.designpatterns.factory.components.button.AndroidButton;
import org.lld.designpatterns.factory.components.button.Button;
import org.lld.designpatterns.factory.components.dropdown.AndroidDropdown;
import org.lld.designpatterns.factory.components.dropdown.Dropdown;
import org.lld.designpatterns.factory.components.menu.AndriodMenu;
import org.lld.designpatterns.factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new AndriodMenu();
    }

    @Override
    public Dropdown createDropDown() {
        return new AndroidDropdown();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
