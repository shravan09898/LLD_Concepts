package org.lld.designpatterns.factory;

public class UIFactoryFactory {
    public static UIFactory createUIFactory(SupportedPlatform platform){
        return switch (platform){

            case IOS -> new IosUIFactory();
            case ANDROID -> new AndroidUIFactory();
        };
    }
}
