package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: azv reason: default package */
public final class azv extends azw {
    public final int a;
    public final long b;
    public final long c;
    public final boolean d;
    public final int e;
    public final long f;
    public final int g;
    public final long h;
    public final boolean i;
    public final boolean j;
    public final ast k;
    public final List<a> l;
    public final long m;

    /* renamed from: azv$a */
    public static final class a implements Comparable<Long> {
        public final String a;
        public final a b;
        public final long c;
        public final int d;
        public final long e;
        public final ast f;
        public final String g;
        public final String h;
        public final long i;
        public final long j;
        public final boolean k;
        private String l;

        public a(String str, long j2, long j3) {
            this(str, null, "", 0, -1, -9223372036854775807L, null, null, null, j2, j3, false);
        }

        public a(String str, a aVar, String str2, long j2, int i2, long j3, ast ast, String str3, String str4, long j4, long j5, boolean z) {
            this.a = str;
            this.b = aVar;
            this.l = str2;
            this.c = j2;
            this.d = i2;
            this.e = j3;
            this.f = ast;
            this.g = str3;
            this.h = str4;
            this.i = j4;
            this.j = j5;
            this.k = z;
        }

        public final /* synthetic */ int compareTo(Object obj) {
            Long l2 = (Long) obj;
            if (this.e > l2.longValue()) {
                return 1;
            }
            return this.e < l2.longValue() ? -1 : 0;
        }
    }

    public azv(int i2, String str, List<String> list, long j2, long j3, boolean z, int i3, long j4, int i4, long j5, boolean z2, boolean z3, boolean z4, ast ast, List<a> list2) {
        String str2 = str;
        List<String> list3 = list;
        super(str, list, z2);
        this.a = i2;
        this.c = j3;
        this.d = z;
        this.e = i3;
        this.f = j4;
        this.g = i4;
        this.h = j5;
        this.i = z3;
        this.j = z4;
        this.k = ast;
        this.l = Collections.unmodifiableList(list2);
        if (!list2.isEmpty()) {
            a aVar = (a) list2.get(list2.size() - 1);
            this.m = aVar.e + aVar.c;
        } else {
            this.m = 0;
        }
        long j6 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 >= 0 ? j2 : this.m + j2;
        this.b = j6;
    }

    public final long a() {
        return this.c + this.m;
    }

    public final /* bridge */ /* synthetic */ Object a(List list) {
        return this;
    }
}
