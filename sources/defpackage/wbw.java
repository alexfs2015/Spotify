package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: wbw reason: default package */
public final class wbw {
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final String f;
    final List<wbu> g;
    final Map<String, String> h;
    final String i;
    final String j;

    /* renamed from: wbw$a */
    public static final class a {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        private List<wbu> h;
        private final Map<String, String> i;

        private a() {
            this.i = new HashMap();
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final a a(String str, String str2) {
            this.i.put(str, str2);
            return this;
        }

        public final a a(List<wbu> list) {
            this.h = new ArrayList(list);
            return this;
        }

        public final wbw a() {
            wbw wbw = new wbw(this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.i, this.g, 0);
            return wbw;
        }
    }

    private wbw(String str, String str2, String str3, String str4, String str5, String str6, List<wbu> list, Map<String, String> map, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
        this.h = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.i = str7;
        this.j = UUID.randomUUID().toString();
    }

    /* synthetic */ wbw(String str, String str2, String str3, String str4, String str5, String str6, List list, Map map, String str7, byte b2) {
        this(str, str2, str3, str4, str5, str6, list, map, str7);
    }

    public static a a() {
        return new a(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        wbw wbw = (wbw) obj;
        return this.a.equals(wbw.a) && this.b.equals(wbw.b) && this.c.equals(wbw.c) && this.d.equals(wbw.d) && this.e.equals(wbw.e) && this.f.equals(wbw.f) && this.g.equals(wbw.g) && this.h.equals(wbw.h) && this.i.equals(wbw.i);
    }

    public final int hashCode() {
        return (((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[9];
        List<wbu> list = this.g;
        int size = list.size();
        if (size > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append(list.get(i2));
                if (i2 != size - 1) {
                    sb.append('/');
                }
            }
            str = sb.toString();
        } else {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = this.e;
        objArr[2] = this.f;
        objArr[3] = this.a;
        objArr[4] = this.b;
        objArr[5] = this.c;
        objArr[6] = this.d;
        objArr[7] = this.i;
        objArr[8] = this.j;
        return String.format("%s :: %s - %s (%s, %s, %s, %s, %s) [%s]", objArr);
    }
}
