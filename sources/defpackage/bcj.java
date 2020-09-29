package defpackage;

import java.io.File;

/* renamed from: bcj reason: default package */
public class bcj implements Comparable<bcj> {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    public bcj(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = file != null;
        this.e = file;
        this.f = j3;
    }

    public final boolean a() {
        return this.c == -1;
    }

    public final boolean b() {
        return !this.d;
    }

    /* renamed from: a */
    public final int compareTo(bcj bcj) {
        if (!this.a.equals(bcj.a)) {
            return this.a.compareTo(bcj.a);
        }
        long j = this.b - bcj.b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }
}
