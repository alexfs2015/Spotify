package defpackage;

import java.util.List;

/* renamed from: kao reason: default package */
public final class kao {
    final List<kaw> a;
    private final long b;
    private final long c;
    private final long d;

    public kao(long j, long j2, long j3, List<kaw> list) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.a = list;
    }

    public final long a() {
        return (this.d - this.c) * 1000;
    }

    public final kaw a(int i) {
        return (kaw) this.a.get(i);
    }
}
