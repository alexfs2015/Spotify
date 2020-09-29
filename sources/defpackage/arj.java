package defpackage;

/* renamed from: arj reason: default package */
public final class arj {
    public static final arj a = new arj(0, 0);
    public static final arj b = a;
    public final long c;
    public final long d;

    static {
        new arj(Long.MAX_VALUE, Long.MAX_VALUE);
        new arj(Long.MAX_VALUE, 0);
        new arj(0, Long.MAX_VALUE);
    }

    public arj(long j, long j2) {
        boolean z = true;
        bdl.a(j >= 0);
        if (j2 < 0) {
            z = false;
        }
        bdl.a(z);
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            arj arj = (arj) obj;
            return this.c == arj.c && this.d == arj.d;
        }
    }

    public final int hashCode() {
        return (((int) this.c) * 31) + ((int) this.d);
    }
}
