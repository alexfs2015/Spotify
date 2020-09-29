package com.spotify.mobile.android.service.media.browser;

import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Locale;

public enum RootListType {
    AUTOMOTIVE("automotive"),
    DEFAULT("default"),
    NAVIGATION("navigation"),
    FITNESS("fitness"),
    WAKE("wake"),
    SLEEP("sleep");
    
    public static final RootListType[] d = null;
    public final String name;

    static {
        d = values();
    }

    private RootListType(String str) {
        this.name = str;
    }

    @JsonCreator
    public static RootListType forValue(String str) {
        if (str == null) {
            return DEFAULT;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        if (AUTOMOTIVE.name.equals(lowerCase)) {
            return AUTOMOTIVE;
        }
        if (NAVIGATION.name.equals(lowerCase)) {
            return NAVIGATION;
        }
        if (FITNESS.name.equals(lowerCase)) {
            return FITNESS;
        }
        if (WAKE.name.equals(lowerCase)) {
            return WAKE;
        }
        if (SLEEP.name.equals(lowerCase)) {
            return SLEEP;
        }
        return DEFAULT;
    }
}
