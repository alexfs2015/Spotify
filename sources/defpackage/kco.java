package defpackage;

import java.util.List;

/* renamed from: kco reason: default package */
public final class kco {
    final List<kcw> a;
    private final long b;
    private final long c;
    private final long d;

    public kco(long j, long j2, long j3, List<kcw> list) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.a = list;
    }

    public final long a() {
        return (this.d - this.c) * 1000;
    }

    public final kcw a(int i) {
        return (kcw) this.a.get(i);
    }
}
