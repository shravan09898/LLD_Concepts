package org.lld.designpatterns.factory;

public class Flutter {
    private SupportedPlatform platform;

    public Flutter(SupportedPlatform platform) {
        this.platform = platform;
    }

    public void setTheme(){
        System.out.println("Setting a theme");
    }

    public void setRefreshRate(){
        System.out.println("Setting desired refreshRate");
    }

    public UIFactory createUIFactory(){
        //Object of UIFactory -> Android/iOSUIFactory
        // depending upon what platform has chosen

        return UIFactoryFactory.createUIFactory(this.platform);
    }
}
