package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: von reason: default package */
public final class von {
    final String a;
    final String b;
    final String c;
    final String d;
    final List<vom> e;
    final String f;
    final String g;

    /* renamed from: von$a */
    public static final class a {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        private List<vom> f;

        /* synthetic */ a(byte b2) {
            this();
        }

        private a() {
        }

        public final a a(List<vom> list) {
            this.f = new ArrayList(list);
            return this;
        }

        public final von a() {
            von von = new von(this.a, this.b, this.c, this.d, this.f, this.e, 0);
            return von;
        }
    }

    /* synthetic */ von(String str, String str2, String str3, String str4, List list, String str5, byte b2) {
        this(str, str2, str3, str4, list, str5);
    }

    private von(String str, String str2, String str3, String str4, List<vom> list, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
        this.f = str5;
        this.g = UUID.randomUUID().toString();
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[7];
        List<vom> list = this.e;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        von von = (von) obj;
        return this.a.equals(von.a) && this.b.equals(von.b) && this.c.equals(von.c) && this.d.equals(von.d) && this.e.equals(von.e) && this.f.equals(von.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public static a a() {
        return new a(0);
    }
}
