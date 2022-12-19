package com.rapidtech.springdasar.singleton;

public class MySingletone {
    private static MySingletone trySingleton;

    public static MySingletone getInstance(){
        if(trySingleton == null){
            trySingleton = new MySingletone();
        }
        return trySingleton;
    }
    private MySingletone(){
    }
}
