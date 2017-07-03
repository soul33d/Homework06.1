package com.homelearning.abstract_factory;

import com.homelearning.abstract_factory.factory.GUIFactory;
import com.homelearning.abstract_factory.factory.LinuxGUIFactory;
import com.homelearning.abstract_factory.factory.MacGUIFactory;
import com.homelearning.abstract_factory.factory.WindowsGUIFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        GUIFactory guiFactory = getFactory();
        guiFactory.newWindow().show();
        guiFactory.newMenu().show();
        guiFactory.newButton().show();
    }

    private static GUIFactory getFactory() {
        String osName = System.getProperty("os.name");
        if (osName.contains("Linux")) return new LinuxGUIFactory();
        else if (osName.contains("Mac")) return new MacGUIFactory();
        else if (osName.contains("Win")) return new WindowsGUIFactory();
        else throw new NotSupportedOSError("There is no GUIFactory for " + osName);
    }
}
