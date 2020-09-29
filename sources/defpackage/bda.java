package defpackage;

import java.io.File;

/* renamed from: bda reason: default package */
public class bda implements Comparable<bda> {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    public bda(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = file != null;
        this.e = file;
        this.f = j3;
    }

    /* renamed from: a */
    public final int compareTo(bda bda) {
        if (!this.a.equals(bda.a)) {
            return this.a.compareTo(bda.a);
        }
        long j = this.b - bda.b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final boolean a() {
        return this.c == -1;
    }

    public final boolean b() {
        return !this.d;
    }
}
