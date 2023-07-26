package org.lld.designpatterns.factory;

import org.lld.designpatterns.factory.components.button.Button;
import org.lld.designpatterns.factory.components.button.IosButton;
import org.lld.designpatterns.factory.components.dropdown.Dropdown;
import org.lld.designpatterns.factory.components.dropdown.IosDropdown;
import org.lld.designpatterns.factory.components.menu.IosMenu;
import org.lld.designpatterns.factory.components.menu.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public Dropdown createDropDown() {
        return new IosDropdown();
    }

    @Override
    public Button createButton() {
        return new IosButton();
    }
}
