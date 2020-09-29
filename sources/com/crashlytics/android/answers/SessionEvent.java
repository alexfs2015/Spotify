package com.crashlytics.android.answers;

import android.app.Activity;
import java.util.Collections;
import java.util.Map;

public final class SessionEvent {
    public final ahm a;
    public final long b;
    public final Type c;
    public final Map<String, String> d;
    public final String e;
    public final Map<String, Object> f;
    public final String g;
    public final Map<String, Object> h;
    private String i;

    public enum Type {
        START,
        RESUME,
        PAUSE,
        STOP,
        CRASH,
        INSTALL,
        CUSTOM,
        PREDEFINED
    }

    public static class a {
        public final Type a;
        public final long b = System.currentTimeMillis();
        public Map<String, String> c = null;
        public Map<String, Object> d = null;
        private String e = null;
        private String f = null;
        private Map<String, Object> g = null;

        public a(Type type) {
            this.a = type;
        }
    }

    public /* synthetic */ SessionEvent(ahm ahm, long j, Type type, Map map, String str, Map map2, String str2, Map map3, byte b2) {
        this(ahm, j, type, map, str, map2, str2, map3);
    }

    public static a a(Type type, Activity activity) {
        Map<String, String> singletonMap = Collections.singletonMap("activity", activity.getClass().getName());
        a aVar = new a(type);
        aVar.c = singletonMap;
        return aVar;
    }

    private SessionEvent(ahm ahm, long j, Type type, Map<String, String> map, String str, Map<String, Object> map2, String str2, Map<String, Object> map3) {
        this.a = ahm;
        this.b = j;
        this.c = type;
        this.d = map;
        this.e = str;
        this.f = map2;
        this.g = str2;
        this.h = map3;
    }

    public final String toString() {
        if (this.i == null) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(getClass().getSimpleName());
            sb.append(": timestamp=");
            sb.append(this.b);
            sb.append(", type=");
            sb.append(this.c);
            sb.append(", details=");
            sb.append(this.d);
            sb.append(", customType=");
            sb.append(this.e);
            sb.append(", customAttributes=");
            sb.append(this.f);
            sb.append(", predefinedType=");
            sb.append(this.g);
            sb.append(", predefinedAttributes=");
            sb.append(this.h);
            sb.append(", metadata=[");
            sb.append(this.a);
            sb.append("]]");
            this.i = sb.toString();
        }
        return this.i;
    }
}
