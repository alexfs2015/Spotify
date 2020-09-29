package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: wbv reason: default package */
public final class wbv {
    final String a;
    final String b;
    final String c;
    final String d;
    final List<wbu> e;
    final String f;
    final String g;

    /* renamed from: wbv$a */
    public static final class a {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        private List<wbu> f;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final a a(List<wbu> list) {
            this.f = new ArrayList(list);
            return this;
        }

        public final wbv a() {
            wbv wbv = new wbv(this.a, this.b, this.c, this.d, this.f, this.e, 0);
            return wbv;
        }
    }

    private wbv(String str, String str2, String str3, String str4, List<wbu> list, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
        this.f = str5;
        this.g = UUID.randomUUID().toString();
    }

    /* synthetic */ wbv(String str, String str2, String str3, String str4, List list, String str5, byte b2) {
        this(str, str2, str3, str4, list, str5);
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
        wbv wbv = (wbv) obj;
        return this.a.equals(wbv.a) && this.b.equals(wbv.b) && this.c.equals(wbv.c) && this.d.equals(wbv.d) && this.e.equals(wbv.e) && this.f.equals(wbv.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[7];
        List<wbu> list = this.e;
        int size = list.size();
        if (size > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < size; i++) {
                sb.append(list.get(i));
                if (i != size - 1) {
                    sb.append('/');
                }
            }
            str = sb.toString();
        } else {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = this.a;
        objArr[2] = this.b;
        objArr[3] = this.c;
        objArr[4] = this.d;
        objArr[5] = this.f;
        objArr[6] = this.g;
        return String.format("%s :: (%s, %s, %s, %s, %s) [%s]", objArr);
    }
}
