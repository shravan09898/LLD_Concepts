package org.lld.designpatterns.singleton;

public class SingletonMultithreaded {
    private static SingletonMultithreaded instance;
    private SingletonMultithreaded(){
    }

    public static SingletonMultithreaded getObject(){
        if(instance==null){
            synchronized (SingletonMultithreaded.class){   //synchronized(this){}
                if(instance==null){
                    instance = new SingletonMultithreaded();
                }
            }
        }
        return instance;
    }
}
