package com.comscore.util;

public class ObfuscationChecker {
    private static final String a = "com.comscore.util";
    private static final String b = "ObfuscationChecker";

    public boolean isCodeObfuscated() {
        if (!a.equals(getClass().getPackage().getName())) {
            return true;
        }
        return !b.equals(getClass().getSimpleName());
    }
}
