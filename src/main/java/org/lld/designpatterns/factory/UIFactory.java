package org.lld.designpatterns.factory;

import org.lld.designpatterns.factory.components.button.Button;
import org.lld.designpatterns.factory.components.dropdown.Dropdown;
import org.lld.designpatterns.factory.components.menu.Menu;

public interface UIFactory {
    Menu createMenu();
    Dropdown createDropDown();
    Button createButton();
}
