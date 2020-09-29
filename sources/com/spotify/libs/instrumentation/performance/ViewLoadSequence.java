package com.spotify.libs.instrumentation.performance;

import java.util.Map;

public final class ViewLoadSequence {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Map<String, Long> g;
    public final Map<String, String> h;

    public enum Step {
        STARTED("started"),
        RESTORED("restored"),
        DATA_LOADED("data_loaded"),
        CANCELLED("cancelled"),
        FINISHED("finished"),
        FAILED("failed"),
        IMAGE_LOADING_STARTED("image_loading_started"),
        IMAGE_LOADING_FINISHED("image_loading_finished");
        
        private final String mStrValue;

        private Step(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public ViewLoadSequence(String str, String str2, String str3, String str4, String str5, String str6, Map<String, Long> map, Map<String, String> map2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = map;
        this.h = map2;
    }
}
